class Solution:
    def isIsomorphic(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if s == None and pattern == None:
            return True
        if s == None or pattern == None:
            return False
        if len(s) != len(pattern):
            return False
        sMap = {}
        tMap = {}
        for i, j in zip(s, pattern):
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


# class Solution:
#     def isIsomorphic(self, s: str, t: str) -> bool:
#         return [*map(s.index, s)] == [*map(t.index, t)]
