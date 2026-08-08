# Time Complexity : O(n)
# Space Complexity : O(1), because the character set is bounded.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I needed to prevent two different characters from mapping to the same character.
# Approach: I used two dictionaries to track mappings in both directions.
# For each pair of characters, I verified that any existing mapping is still consistent.
# If both directions stay valid through the whole string, the strings are isomorphic.


class Solution:

    def isIsomorphic(self, s, t):
        s_to_t = {}
        t_to_s = {}

        for char_s, char_t in zip(s, t):
            if char_s in s_to_t and s_to_t[char_s] != char_t:
                return False

            if char_t in t_to_s and t_to_s[char_t] != char_s:
                return False

            s_to_t[char_s] = char_t
            t_to_s[char_t] = char_s

        return True
