"""
I used two hash maps to track the character mappings from s to t and from t to s. For each character pair, I check if the existing mapping is consistent; if not, I return False. This ensures a one-to-one correspondence between characters in both strings, confirming if they are isomorphic.
Time Complexity: O(n)
Space Complexity: O(1) only ASCII characters
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sMap = {}
        tMap = {}
        for charS, charT in zip(s, t):
            if charS not in sMap:
                sMap[charS] = charT
            else:
                if sMap[charS] != charT:
                    return False
            if charT not in tMap:
                tMap[charT] = charS
            else:
                if tMap[charT] != charS:
                    return False
        return True
