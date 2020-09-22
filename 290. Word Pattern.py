"""
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", s = "dog dog dog dog"
Output: false
"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        len_p = len(pattern)
        s = s.split()
        len_s = len(s)
        if len_s != len_p :
            return False
        if len_s == 0 and len_p == 0:
            return True
        return self.find(s,pattern, len_s) and self.find(pattern,s, len_s)
    
    def find(self, s,t, length):
        dic = dict()
        for i in range(length):
            if s[i] not in dic:
                dic[s[i]] = t[i]
            else:
                if dic[s[i]] != t[i]:
                    return False
        return True
                