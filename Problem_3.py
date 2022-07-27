"""
Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Problem 3: Given a pattern and a string str, find if str follows the same pattern.Here follow means a full match,
           such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:
Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false

Example 4:
Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
"""

class Solution_1:
    """
    In this method we will use two hashMaps to store the mapping of each word from s->pattern
    and in other HashMap from pattern->s. If both the mapping is not same we return False
    itype: string
    rtype: bool
    Time Complexity : O(N), where N is the length of each string
    Space Complexity : O(1) as the letters are fixed numbers
    
    """

    def wordPattern(self, pattern: str, s: str) -> bool:
        s_map = {}
        t_map = {}
        t = s.split(" ")
        if len(t) != len(pattern):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] in s_map and s_map[pattern[i]] != t[i]:
                return False
            if t[i] in t_map and t_map[t[i]] != pattern[i]:
                return False
            
            s_map[pattern[i]] = t[i]
            t_map[t[i]] = pattern[i]
        return True
        