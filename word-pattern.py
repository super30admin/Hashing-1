"""
This solution uses two hash maps to check if the characters in pattern and the words in s are isomorphic. 
It checks if each character in pattern maps to a unique word in s and vice versa.
"""

# Time Complexity : O(n)
# Space Complexity : O(n) because the words array will have n words
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pattern_map = {}
        s_map = {}
        
        words = s.split()
        
        if len(pattern) != len(words):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] in pattern_map:
                if pattern_map[pattern[i]] != words[i]:
                    return False
            else:
                pattern_map[pattern[i]] = words[i]
                
            if words[i] in s_map:
                if s_map[words[i]] != pattern[i]:
                    return False
            else:
                s_map[words[i]] = pattern[i]
                
        return True
        
        
            