# https://leetcode.com/problems/isomorphic-strings/description/

# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach in three sentences only
# Approach : We have to check the mapping of characters in both the strings. If they don't match then return False.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        left_table = {}
        right_table = {}
        if len(s) != len(t):
            return False
        for i, j in zip(s, t):
            if i not in left_table:
                left_table[i] = j
            if j not in right_table:
                right_table[j] = i
            if left_table[i] != j or right_table[j] != i:
                return False
        return True