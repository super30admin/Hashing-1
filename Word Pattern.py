class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pmap = {}
        smap = {}
        l = s.split()
        # print(l)
        if len(pattern) != len(l):
            return False
        for i in range(len(l)):
            p = pattern[i]
            L = l[i]
            if p in pmap and pmap[p] != L:
                return False
            else:
                pmap[p] = L
            if L in smap and smap[L] != p:
                return False
            else:
                smap[L] = p
        return True
