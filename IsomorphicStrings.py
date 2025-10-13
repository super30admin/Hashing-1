# Time Complexity : O(n) where n is the length of the strings
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
My approach:
Use two maps to store the mapping of characters in s to characters in t and vice versa.
If character is already in a map, check values match. 
Otherwise, check if character is available in the other map and add to both maps.
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        tMap = dict()
        sMap = dict()

        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            if s[i] in sMap:
                if sMap[s[i]] != t[i]:
                    return False
            else:
                if t[i] in tMap:
                    return False
                
                sMap[s[i]] = t[i]
                tMap[t[i]] = s[i]

        return True