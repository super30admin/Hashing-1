class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) == 0 or len(t)==0:
            return False
        d = {}
        for i, ch in enumerate(s):
            if ch not in d.keys() and t[i] and t[i] not in d.values():
                d[ch] = t[i]
            else:
                if ch not in d.keys() and t[i] in d.values():
                    return False
                if d[ch] != t[i]:
                    return False
        return True