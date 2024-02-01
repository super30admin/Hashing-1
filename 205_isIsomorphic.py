class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s == None and t == None:
            return True
        if s == None or t == None:
            return False
        if len(s) != len(t):
            return False
        sMap = {}
        tMap = {}
        for i, j in zip(s, t):
            if sMap.get(i) != None:
                if sMap.get(i) != j:
                    return False
            else:
                sMap[i] = j
            if tMap.get(j) != None:
                if tMap.get(j) != i:
                    return False
            else:
                tMap[j] = i
        return True
