## Problem 3:
# Given a pattern and a string str, find if str follows the same pattern.
# Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# Example 1:
# Input: pattern = "abba", str = "dog cat cat dog"
# Output: true
# # TC : O(n)
# # SC : O(n)
# Code explaination:
# 1. This code is written using single hashing
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_map = {}
        s = s.split()
        if len(pattern) != len(s):
            return False
        for i in range(len(pattern)):
            char_key = 'char_{}'.format(pattern[i])
            char_word = 'word_{}'.format(s[i])
            if char_key not in s_map:
                s_map[char_key] = i
            if char_word not in s_map:
                s_map[char_word] = i
            if s_map[char_word]!=s_map[char_key]:
                return False
        return True
           
            
                
            
        # s_t = {}
        # t_s = {}
        # s = s.split()
        # if len(s)!=len(pattern):
        #     return False
        # for c1, c2 in zip(s, pattern):
        #     # print(c1, c2)
        #     if c1 not in s_t and c2 not in t_s:
        #         s_t[c1] = c2
        #         t_s[c2] = c1
        #     elif s_t.get(c1)!=c2 or t_s.get(c2)!=c1:
        #         return False
        # return True
        