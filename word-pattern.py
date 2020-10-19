# Time Complexity: O(n) where n is the length of the string
# Space Complexity: O(n*k) where n is length of the string and k is the length of words(rather, length of the longest word - in the worst case we will have to store n keys of size k each)
# Did this run on Leetcode: Yes
# Any problems faced: No
# Approach: (Similar to isomorphic strings)
 # - Store mapping for exery character in the pattern with every word in the string and vice versa
 # - If there is a mismatch at any point return False

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        # Convert s to an array of words
        s = s.split()
        
        # Edge Case
        if len(pattern) != len(s):
            return False
        
        # Maps to store character mappings
        s_map = {}
        pattern_map = {}
        
        for i in range(len(s)):
            s_char = s[i]
            pattern_word = pattern[i]
            if s_char in s_map:
                if s_map[s_char] != pattern_word:
                    return False
                
            if pattern_word in pattern_map:
                if pattern_map[pattern_word] != s_char:
                    return False
                
            s_map[s_char] = pattern_word
            pattern_map[pattern_word] = s_char
            
        return True