# Isomorphic Strings
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #create map of char in s to t when validating from s to t, to validate same char is not mapped to 2 different char. If yes it's not isomorphic
        #rplicate same from t to s
        # for runtiime optimization do it in 1 pass

        sToTMap = {}
        tToSMap = {}
        for i in range(0,len(s)):
            sChar = s[i]
            tCHar = t[i]
            if sChar in sToTMap:
                if sToTMap[sChar] != tCHar:
                    return False
            else:
                sToTMap[sChar] = tCHar

            if tCHar in tToSMap:
                if tToSMap[tCHar] != sChar:
                    return False
            else:
                tToSMap[tCHar] = sChar
        return True
