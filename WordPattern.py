class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
            char = s.split()
            pDict = {}
            cSet = set()

            if pattern == None or len(pattern) == 0:
                return False
            if len(pattern) != len(char):
                return False

            for i in range(len(pattern)):
                p = pattern[i]
                c = char[i]

                if p not in pDict:
                    if c not in cSet:
                        pDict[p] = c
                        cSet.add(c)
                    else:
                        return False
                else:
                    if pDict[p] != c:
                        return False
            return True
