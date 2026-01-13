# Time Complexity : O(n) where n is the length of strings
# Space Complexity : O(1) since we use fixed size character maps (max 256 characters)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use two hash maps to maintain bidirectional mapping between characters of s and t.
# For each character pair, check if mapping already exists and if it conflicts with current mapping.
# If any conflict is found (one character maps to different characters or two characters map to same), return False.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        s_to_t = {}
        t_to_s = {}
        
        for i in range(len(s)):
            char_s = s[i]
            char_t = t[i]
            
            # Check if s->t mapping exists and conflicts
            if char_s in s_to_t:
                if s_to_t[char_s] != char_t:
                    return False
            else:
                s_to_t[char_s] = char_t
            
            # Check if t->s mapping exists and conflicts
            if char_t in t_to_s:
                if t_to_s[char_t] != char_s:
                    return False
            else:
                t_to_s[char_t] = char_s
        
        return True

