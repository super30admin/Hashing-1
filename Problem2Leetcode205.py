class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap={}
        tMap={}
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            # 1 Hashmap to check with t
            if sChar in sMap:
                if sMap[sChar]!=tChar:
                    return False
            else:
                sMap[sChar]=tChar
            # 2 Hashmap to check with s
            if tChar in tMap:
                if tMap[tChar]!=sChar:
                    return False
            else:
                tMap[tChar]=sChar
        return True

        