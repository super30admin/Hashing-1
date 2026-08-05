"""
Approach:
-> Similar to isomorphic strings, we can use two hashmaps to store the mapping of characters from pattern to words in s and vice versa.
-> We iterate through the characters of pattern and words in s and check if the mapping exists in both hashmaps. If it does, we check if the mapping is consistent; If mapping is not consistent, we return False. Otherwise, if mapping exists and is consistent, we add the mapping to both hashmaps.
    
Time Complexity:
O(N) where N is the length of the input strings.

Space Complexity:
O(N) where N is the length of the input strings. We are using two hashmaps to store the mapping of characters from pattern to words in s and vice versa.
"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        pattern_word_map, word_pattern_map = {}, {}
        pattern = list(pattern)
        s= s.split(" ")

        if len(s) != len(pattern):
            return False

        for i in range(len(pattern)):
            if pattern[i] in pattern_word_map:
                if pattern_word_map[pattern[i]] != s[i]:
                    return False
            pattern_word_map[pattern[i]] = s[i]

            if s[i] in word_pattern_map:
                if word_pattern_map[s[i]] != pattern[i]:
                    return False
            word_pattern_map[s[i]] = pattern[i]

        # we can iterate once, since length of pattern and s are same, we can check both mapping in one iteration
        # for i in range(len(s)):
        #     if s[i] in word_pattern_map:
        #         if word_pattern_map[s[i]] != pattern[i]:
        #             return False
        #     word_pattern_map[s[i]] = pattern[i]
        
        return True