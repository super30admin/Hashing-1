class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        smap = {}
        tmap = {}

        for i in range(len(s)):
            S = s[i]
            T = t[i]
            if S in smap and smap[S] != T:
                return False
            else:
                smap[S] = T
            if T in tmap and tmap[T] != S:
                return False
            else:
                tmap[T] = S

        return True

