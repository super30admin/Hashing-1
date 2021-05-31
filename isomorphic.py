"""
https://leetcode.com/problems/isomorphic-strings/

Time Complexity: O(n)
Space Complexity: O(1) as we can have maximum 26 characters.

This worked on Leetcode and did not give any errors.
"""


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        hashMap1 = {}
        hashMap2 = {}
        for letter in range(len(s)):
            if s[letter] in hashMap1:
                if hashMap1[s[letter]] != t[letter]:
                    return False
            else:
                hashMap1[s[letter]] = t[letter]

            if t[letter] in hashMap2:  # "badc" "baba"
                if hashMap2[t[letter]] != s[letter]:
                    return False
            else:
                hashMap2[t[letter]] = s[letter]

        return True