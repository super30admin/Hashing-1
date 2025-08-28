"""
Time Complexity: O(n)
Space Complexity: O(n)

"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): 
            return False
        mp = {}
        used = set()
        
        for i in range(len(s)): 
            if s[i] in mp: 
                if mp[s[i]] != t[i]: 
                    return False
            else: 
                if t[i] in used: 
                    return False
                used.add(t[i])
                mp[s[i]] = t[i]

        return True
