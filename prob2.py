#Leetcode: https://leetcode.com/problems/isomorphic-strings
# We are using two hashmaps to store the mapping of characters from string s to t and vice versa.
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # Check if the strings are empty or of different lengths
        if not s or not t or len(s)!=len(t):
            return False
        mapst, mapts = {} , {}
        for i in range(len(s)):
            # If the character from s is already mapped to a character in t or the character from t is already mapped to a character in s
            # we check if the mapping is consistent, else we return False
            if s[i] in mapst and t[i]!=mapst[s[i]] or t[i] in mapts and s[i] != mapts[t[i]]:
                    return False
            else:
                # If not mapped, we create the mapping
                mapst[s[i]] = t[i]
                mapts[t[i]] = s[i]
        return True