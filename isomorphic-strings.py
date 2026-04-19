
# time complexity O(n), space O(1) because only 26 characters in alphabet
# Keep a map of chars in s to chars in t and seen chars in t and return false when mismatch
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False
        
        mp={}
        seen = set()
        for i in range(len(s)):
            if s[i] not in mp:
                if t[i] not in seen:
                    mp[s[i]]=t[i]
                    seen.add(t[i])
                else:
                    return False
            elif mp[s[i]] != t[i]:
                return False
        
        return True