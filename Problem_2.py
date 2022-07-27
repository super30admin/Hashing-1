"""
Time Complexity : Inside program
Space Complexity : Inside program
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Problem 2:Given two strings s and t, determine if they are isomorphic.Two strings are isomorphic if the characters in s can be replaced to get t.
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
Note:
You may assume both s and t have the same length.
"""

# Approach - 1

class Solution:
    def isIsomorphic(self, s, t):
        """
        In this method we will use two hashMaps to store the mapping of each char from s->t
        and in other HashMap from t->s. If both the mapping is not same we return False
        itype: string
        rtype: bool
        Time Complexity : O(N), where N is the length of each string
        Space Complexity : O(1) as the letters are fixed numbers
        """
        s_map = {}
        t_map = {}

        for i in range(len(s)):
            if s[i] in s_map and s_map[s[i]] != t[i]:
                return False
            if t[i] in t_map and t_map[t[i]] != s[i]:
                return False
            s_map[s[i]] = t[i]
            t_map[t[i]] = s[i]
        return True

# Approach - 2

class Solution_1:
    def transformStr(self, s):
        """
        Helper function to transorm string to its occuerence index
        """
        char_index_map = {}
        index_str = []

        for i in range(len(s)):
            if s[i] not in char_index_map:
                char_index_map[s[i]] = i
            index_str.append(str(char_index_map[s[i]]))
            
        return " ".join(index_str)

    def isIsomorphic(self, s, t):
        """
        We will be transforming the string to its corresponding index occuerence. Storing the transformed index in 
        array and then comparing with the second array tranformation. They both should be equal if they are isomorphic
        itype: string
        rtype: bool
        Time Complexity : O(N), where N is the length of each string
        Space Complexity : O(N) 
        """
        return self.transformStr(s) == self.transformStr(t)

        