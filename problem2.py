class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t) or len(s) == 0 or s == None:
            return False
        
        sMap = {}
        tMap = {}

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]

            if sChar in sMap:
                if sMap.get(sChar) != tChar:
                    return False
            else:
                sMap[sChar] = tChar
            if tChar in tMap:
                if tMap.get(tChar) != sChar:
                    return False
            else:
                tMap[tChar] = sChar
        return True