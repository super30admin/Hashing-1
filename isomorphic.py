class Solution:
    """
    TC -> O(len(s))
    SC -> 2*O(26) -> O(1)
    - If either mapping already exists, verify that it matches the existing association.
    - If the mapping is inconsistent in either direction, return False.
    - Otherwise, store the new pair in both hash maps.
    """
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = {}
        for i in range(len(s)):
            if (s[i] in sMap and sMap[s[i]]!=t[i]) or(t[i] in tMap and tMap[t[i]]!=s[i]):
                return False
            sMap[s[i]] = t[i]
            tMap[t[i]] = s[i]
        return True