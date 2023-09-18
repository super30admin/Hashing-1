class Solution:
    def isIsomorphic(self, s, t):
        smap, tmap = {}, {}
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            cs, ct = s[i], t[i]
            if cs not in smap:
                smap[cs] = ct
            elif smap[cs] != ct:
                return False
            if ct not in tmap:
                tmap[ct] = cs
            elif tmap[ct] != cs:
                return False
        return True
        