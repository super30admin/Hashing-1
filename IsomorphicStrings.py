# TC = O(n)
# SC = O(1)


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = {}
        tset = set()
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] in smap:
                if t[i] != smap[s[i]]:
                    return False
            else:
                smap[s[i]] = t[i]
                if t[i] in tset:
                    return False
                else:
                    tset.add(t[i])
        return True
