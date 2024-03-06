# T.C. : O(n)
# S.C. : O(n)

class Solution:
    def check_key(self, map, key):
        if key in map.keys():
            return True
        else:
            return False

    def isIsomorphic(self, s: str, t: str) -> bool:
        if s is None or t is None:
            return False
        if s is None and t is None:
            return True
        if len(s) != len(t):
            return False
        s_map = {}
        t_map = {}
        for i in range(0, len(s)):
            s_char = s[i]
            t_char = t[i]
            if self.check_key(s_map, s_char):
                if s_map.get(s_char) != t_char:
                    return False
            else:
                s_map[s_char] = t_char

            if self.check_key(t_map, t_char):
                if t_map.get(t_char) != s_char:
                    return False
            else:
                t_map[t_char] = s_char
        return True

        
        
