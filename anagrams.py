# Time Complexity : O(N * K)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Use prime-number hashing to uniquely represent each word.
# Group words by this key and return all hashmap values.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        h_map = {}
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        def getCode(s):
            res = 1
            for ch in s:
                res *= primes[ord(ch) - ord('a')]
            return res

        for word in strs:
            idx = getCode(word)
            if idx not in h_map:
                h_map[idx] = [word]
            else:
                h_map[idx].append(word)

        return list(h_map.values())
