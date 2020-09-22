"""
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) == 0 and len(t) == 0:
            return True
        if len(s) != len(t):
            return False
        return self.find(s, t) and self.find(t, s)
    def find(self, s, t):
        letter = {}
        for i in range(len(s)):
            if s[i] not in letter :
                letter[s[i]] = t[i]
            else:
                if letter[s[i]] != t[i]:
                    return False
        print(letter)
        return True