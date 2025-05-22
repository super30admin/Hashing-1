class Solution:
    """
    TC -> O(len(pattern))
    SC -> O(m) where m is the number of entries
    Logic
    - If either mapping already exists, verify that it matches the existing association.
    - If the mapping is inconsistent in either direction, return False.
    - Otherwise, store the new pair in both hash maps.

    Same logic as isomorphic strings question
    """
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(' ')
        if len(pattern)!=len(s):
            return False
        hm1 = {}
        hm2 = {}
        for i in range(len(pattern)):
            if (pattern[i] in hm1 and hm1[pattern[i]]!=s[i]) or (s[i] in hm2 and hm2[s[i]]!=pattern[i]):
                return False
            hm1[pattern[i]] = s[i]
            hm2[s[i]] = pattern[i]
        return True