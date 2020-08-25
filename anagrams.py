class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anagrams = {}
        anagram = []
        primeNumbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        a = ord("a")
        
        for x in strs:
            total = 1
            for c in x:
                total = total * primeNumbers[ord(c) - ord('a')]
            if(total in anagrams.keys()):
                anagrams[total].append(x)
            else:
                anagrams[total] = [x]

        return list(anagrams.values())
