class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        n = len(s)
        mp = {}
        seen = set()
        for i in range(n):
            if s[i] not in mp:
                if t[i] in seen:
                    return False
                mp[s[i]] = t[i]
                seen.add(t[i])
            else:
                if mp[s[i]] != t[i]:
                    return False
        return True
