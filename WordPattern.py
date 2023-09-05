# Time Complexity = O(n)
# Space Complexity = O(1)

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        if pattern is None and s is None:
            return True
        if pattern is None or s is None: 
            return False
        pattern_to_s = {}
        s_to_pattern = {}
        words = s.split()
        if len(pattern) != len(words):
            return False
        for i in range(len(pattern)):
            pattern_char = pattern[i]
            s_char = words[i]
            if pattern_char in pattern_to_s:
                if pattern_to_s[pattern_char] != s_char: 
                    return False
            else:
                pattern_to_s[pattern_char] = s_char

            if s_char in s_to_pattern:
                if s_to_pattern[s_char] != pattern_char: 
                    return False
            else:
                s_to_pattern[s_char] = pattern_char
        return True
