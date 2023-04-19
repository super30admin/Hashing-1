"""
Time Complexity : O(n) where n is the number of letters in the s or t.
Space Complexity : O(1) as maximum we will store 256 chars in hashMap as Total number of ascii charaters are 256


Did this code successfully run on Leetcode : Yes

Your code here along with comments explaining your approach:
1. Create two HashMaps one to store mapping from s to t and other to store mapping from t to s.
2. If one to one mapping exists return True otherwise return False
"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sHashMap = {}
        tHashMap = {}
        
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        for i in range(len(s)):
            if s[i] not in sHashMap:
                sHashMap[s[i]] = t[i]
            elif sHashMap[s[i]] != t[i]:
                return False
            
            if t[i] not in tHashMap:
                tHashMap[t[i]] = s[i]
            elif tHashMap[t[i]] != s[i]:
                return False
        
        return True

