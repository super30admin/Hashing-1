# Time Complexity : O(N) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# We initialize 2 hashmaps then we compare wethere a element exsist in either hashmaps with different values if it does return false else  we map each character in s to t and the same for t to s
# 205. Isomorphic Strings
# https://leetcode.com/problems/isomorphic-strings/description/


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_to_t = {}
        t_to_s = {}
        if len(s) != len(t):
            return False
        for x in range(len(s)):
            char_s = s[x]
            char_t = t[x]

            if (char_s in s_to_t and s_to_t[char_s] != char_t) or (char_t in t_to_s and t_to_s[char_t] != char_s):
                return False
            
            s_to_t[char_s] = char_t
            t_to_s[char_t] = char_s
            
        return True