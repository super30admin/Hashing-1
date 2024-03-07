# TC= O(nk)
# SC=  O(nk)


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        smap = {}
        tmap = {}
        sarray = s.split()
        if len(sarray) != len(pattern):
            return False
        for i in range(len(pattern)):
            if sarray[i] in smap:
                if pattern[i] != smap[sarray[i]]:
                    return False
            elif pattern[i] in tmap:
                if sarray[i] != tmap[pattern[i]]:
                    return False
            else:
                smap[sarray[i]] = pattern[i]
                tmap[pattern[i]] = sarray[i]
        return True
