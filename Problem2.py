# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_map = {}
        t_map = {}
        for i in range(len(s)):
            s_char = s[i]
            t_char = t[i]
            if (t_char in t_map and t_map[t_char] != s_char) or (s_char in s_map and s_map[s_char] != t_char):
                return False
          
            t_map[t_char] = s_char
            s_map[s_char] = t_char
        
        return True
