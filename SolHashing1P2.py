"""
Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. 
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character 
but a character may map to itself.
Example 1: Input: s = "egg", t = "add" Output: true
Example 2: Input: s = "foo", t = "bar" Output: false
Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.

TC: O(N)
SC: O(N)
Running on LC: yes
Approach:
1. Used dict for storing char of s and used set for storing char of t.
2. if any char is already in charToChar 

"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        isVisited = set()
        charToChar = dict()
        for i in range(0, len(s)):
            if s[i] in charToChar:
                if charToChar[s[i]] != t[i]:
                    return False
            else:
                if t[i] in isVisited:
                    return False
                charToChar[s[i]] = t[i]
                isVisited.add(t[i])
        return True
        
