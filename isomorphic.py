# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        s_to_t = {}
        t_to_s = {}
        
        for ss, tt in zip(s, t):
            if (ss in s_to_t and s_to_t[ss] != tt) or (tt in t_to_s and t_to_s[tt] != ss):
                return False
            s_to_t[ss] = tt
            t_to_s[tt] = ss
        
        return True
