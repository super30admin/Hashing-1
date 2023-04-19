"""
Time Complexity : O(n) where n is the number of letters in the s or t.
Space Complexity : O(1) as maximum we will store 256 chars in hashMap as Total number of ascii charaters are 256


Did this code successfully run on Leetcode : Yes

Your code here along with comments explaining your approach:
1. Create a HashMaps to store mapping from s to t and hashSet to store the mapped charactes in t
2. If one to one mapping exists return True otherwise return False
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tSet = set()
        
        for i in range(len(s)):
            if s[i] in sMap:
                if sMap[s[i]] != t[i]:
                    return False
            else:
                if t[i] in tSet:
                    return False
                else:
                    sMap[s[i]] = t[i]
                    tSet.add(t[i])
        return True