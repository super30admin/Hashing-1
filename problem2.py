"""
Approach:
You iterate through both strings simultaneously, creating a one-to-one mapping from s to t using a dictionary.
A set ensures no two characters in s map to the same character in t.
If any mismatch or duplicate mapping occurs, you return False; otherwise, return True.

Time Complexity: O(n) — you traverse each character in both strings once.
Space Complexity: O(n) — for storing mappings and the set of used characters.
"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = {}
        used = set()
        for i in range(len(s)):
                schar = s[i]
                tchar = t[i]
                if schar in smap:
                    if smap[schar] != tchar:
                        return False
                else:
                    if tchar in used:
                        return False
                    smap[schar]=tchar
                    used.add(tchar)
        return True
