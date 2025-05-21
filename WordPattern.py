# Time Complexity: O(N + M) -> O(N), N is the length of the s and M is the length of pattern
# Space Complexity: O(N), N is the length of the s
# Did this code successfully run on Leetcode: Yes

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s_list = s.split(" ")

        if len(s_list) != len(pattern):
            return False
        
        pattern_map = {}
        s_set = set()

        for index in range(len(pattern)):
            if pattern[index] in pattern_map:
                if pattern_map[pattern[index]] != s_list[index]:
                    return False
            else:
                if s_list[index] in s_set:
                    return False
                s_set.add(s_list[index])
                pattern_map[pattern[index]] = s_list[index]
        
        return True