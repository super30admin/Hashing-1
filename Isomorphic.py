class Solution:

    # using hashmap and hashset
    # TC: O(n), SC: O(1)
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s is None and t is None: return True
        if s is None or t is None: return False
        if len(s) != len(t): return False

        smap = {}
        tSet = set()

        for i in range(0, len(s)):
            sChar = s[i]
            tChar = t[i]
            
            if sChar not in smap:
                if tChar not in tSet:
                    smap[sChar] = tChar
                    tSet.add(tChar)
                else:
                    return False
            else:
                if smap[sChar] != tChar: return False   
        return True