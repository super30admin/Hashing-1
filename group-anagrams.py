class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """

        ########
        # Intuition: sort each string and store it in hashmap & then search. If found, just append the string to the values list of that key
        ########

        # out = {}

        # for i in strs:  # TC: O(n)
        #     sortedVal = ''.join(sorted(i))  # TC: O(klog(k))
        #     if sortedVal not in out:
        #         out[sortedVal] = []
        #     out[sortedVal].append(i)  # SC: O(nk)
        # return out.values()

        ########
        # Intuition: prime product
        ########

        refMap = {}
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,  # SC: O(26) = O(1)
                 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]

        # TC: O(n*k) where n = number of strings, and k = number of letters in a string
        # SC: O(nk) worst case if every string is unique there'll be only n keys in hashmap however each key has a value that is pointing to another list which can have k strings
        for s in strs:
            print(s)
            result = 1
            for chr in s:
                # this will give idx associated with the char in prime array. Keep multiplying for all the chars in a string until you get result. If result is unique, store in map. If not, just append to the existing list of values for that key in the map
                result = result * prime[ord(chr) - ord('a')]
            if result not in refMap:
                refMap[result] = []
            refMap[result].append(s)
        return refMap.values()
