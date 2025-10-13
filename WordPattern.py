# Time Complexity : O(n) where n is the length of the strings
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
My approach:
Use two maps to store the mapping of characters in pattern to words in s and vice versa.
If character is already in a map, check values match. 
Otherwise, check if character is available in the other map and add to both maps.
'''
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sArr = s.split(' ')

        if len(sArr) != len(pattern):
            return False

        pMap = dict()
        sMap = dict()

        for i in range(len(sArr)):
            if pattern[i] in pMap:
                if pMap[pattern[i]] != sArr[i]:
                    return False
            else:
                if sArr[i] in sMap:
                    return False
                pMap[pattern[i]] = sArr[i]
                sMap[sArr[i]] = pattern[i]
        
        return True