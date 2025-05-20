# Will create a hashTable with the keys as the tuple of list of the frequency of each character and if any other word matches the frequency is appended to the list of the key.


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        hashTb = {}

        for s in strs:  #o(n)
            freq = [0]*26  # o(26)~o(1)

            for c in s: #o(k)
                freq[ord(c)-ord('a')]+=1

            freq = tuple(freq)

            if freq not in hashTb:
                hashTb[freq] = []
            hashTb[freq].append(s)

        result = []
        for v in hashTb: #o(n)
            result.append(hashTb[v])

        return result