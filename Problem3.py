# Time Complexity: O(n)
# Space Complexity: O(n + k) where n is the string and k the pattern

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if len(pattern) != len(s):
            return False

        pattern_map = {}
        str_map = {}
        for i in range(len(s)):
            char = pattern[i]
            if char in pattern_map and s[i] != pattern_map[char]: 
                return False
            if s[i] in str_map and str_map[s[i]] != char:
                return False
            
            pattern_map[char] = s[i]
            str_map[s[i]] = char
        
        return True
        
