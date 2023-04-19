"""
Time Complexity : O(n)
Space Complexity : O(n)
where n is the number of elements in strs 

Did this code successfully run on Leetcode : Yes

Your code here along with comments explaining your approach:
1. Create two HashMaps one to store mapping from pattern to s and other to store mapping from s to pattern.
2. If one to one mapping exists return True otherwise return False
"""


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word = s.split(' ')
        if len(pattern) != len(word):
            return False

        patternHashMap = {}
        sHashMap = {}

        for i in range(len(pattern)):
            if pattern[i] not in patternHashMap and word[i] not in sHashMap:
                patternHashMap[pattern[i]] = word[i]
                sHashMap[word[i]] = pattern[i]
            elif pattern[i] in patternHashMap and patternHashMap[pattern[i]] != word[i]:
                return False
            elif word[i] in sHashMap and sHashMap[word[i]] != pattern[i]:
                return False

        return True
