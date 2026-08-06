#Time Complexity: O(n)
#Space Complexity: O(n)
#Did you complete this code successfully? Yes

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        mapping = {}

        for s in strs:
            hash = self.getHash(s)

            if hash not in mapping:
                mapping[hash] = []

            mapping.get(hash).append(s)

        return list(mapping.values())

    def getHash(self, s):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        hash = 1
        for c in s:
            hash *= primes[ord(c) - ord('a')]
            
        return hash
                

        