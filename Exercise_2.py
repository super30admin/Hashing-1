# ## Problem 2:
# Given two strings s and t, determine if they are isomorphic.
# Two strings are isomorphic if the characters in s can be replaced to get t.
# All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

# Example 1:
# Input: s = "egg", t = "add"
# Output: true

# Example 2:
# Input: s = "foo", t = "bar"
# Output: false

# Example 3:
# Input: s = "paper", t = "title"
# Output: true
# Note:
# You may assume both s and t have the same length.

# // Time Complexity :O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach

class Solution:
    def isIsomorphic(self, s, t):
        if len(s) != len(t):
            return False
        if len(s) == 0 or len(t) == 0:
            return False
        # hashmap for all s to t mappings
        s_hmap = {}
        # hashmap for all t to s mappings
        t_hmap = {}
        for i in range(len(s)):
            # if char not present in s_hmap keys
            if s[i] not in s_hmap:
                # add it to hashmap
                s_hmap[s[i]] = t[i]
            else:
                # if already present and not the same
                if s_hmap[s[i]] != t[i]:
                    # not Isomorphic
                    return False
        # Isomorphic
        return True
