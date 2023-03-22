class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sMap = {}
        tMap = {}
        for l in range(len(s)):
            sChar = s[l]
            tChar = t[l]
            if sMap.get(sChar) != None:
                if sMap[sChar] != tChar:
                    return False
            else:
               sMap[sChar] = tChar
            if tMap.get(tChar) != None:
                if tMap[tChar] != sChar:
                    return False
                else:
                    tMap[tChar] = sChar
        return True