"""
TC: O(n)
SC: O(1)
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        mapping_s = {}
        mapping_t = {}
        
        for idx in range(len(s)):
            if s[idx] not in mapping_s :
                mapping_s[s[idx]] = t[idx]
            
            if mapping_s[s[idx]] != t[idx] :
                return False
            
            if t[idx] not in mapping_t :
                mapping_t[t[idx]] = s[idx]
            
            if mapping_t[t[idx]] != s[idx] :
                return False
        
        return True
        
