"""
This solution uses two hash maps to check if the characters in s and t are isomorphic. 
It checks if each character in s maps to a unique character in t and vice versa.
"""

# Time Complexity : O(n)
# Space Complexity : O(1) because the hash maps will only have at most 26 characters
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:        
        s_map = {}
        t_map = {}
        
        for i in range(len(s)):
            if s[i] in s_map:
                if s_map[s[i]] != t[i]:
                    return False
            else:
                s_map[s[i]] = t[i]

            if t[i] in t_map:
                if t_map[t[i]] != s[i]:
                    return False
            else:
                t_map[t[i]] = s[i]
                
        return True
        