# T.c -> O(n) [n-> Length of the string]
# S.c -> O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s)!= len(t):
            return False
        
        sMap={}
        tMap= {}

        for i in range(len(s)):

            sChar= s[i]
            tChar= t[i]
            # Validating Smap -> Tmap Mapping.
            if sChar in sMap.keys():
                if sMap[sChar]!=tChar:
                    return False
            else:
                sMap[sChar]= tChar
            
            # Validating Tmap -> Smap Mapping.
            if tChar in tMap.keys():
                if tMap[tChar]!= sChar:
                    return False
            else:
                tMap[tChar]= sChar
        return True
