# Time Complexity: O(n) where n is the length of the string
# Space Complexity: O(n) where n is length of the string
# Did this run on Leetcode: Yes
# Any problems faced: No
# Approach:
 # - Store mapping for exery character in the pattern with every word in the string and vice versa
 # - If there is a mismatch at any point return False

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # Edge Case
        if len(s) != len(t):
            return False
        
        # Maps to store character mappings
        # use default dict to avoid missing KeyError
        s_map = collections.defaultdict(str)
        t_map = collections.defaultdict(str)
        
        for i in range(len(s)):
            s_char = s[i]
            t_char = t[i]
            if s_char in s_map:
                if s_map[s_char] != t_char:
                    return False
                
            if t_char in t_map:
                if t_map[t_char] != s_char:
                    return False
                
            s_map[s_char] = t_char
            t_map[t_char] = s_char
            
        return True
            
            