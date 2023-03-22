
# same as isomorphic string problem. Just create list of words in the beginning

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        sList = s.split(" ")
        print(sList)
        if len(pattern) != len(sList):
            return False
        pMap = {}
        sSet = set()
        for i in range(len(pattern)):
            if pattern[i] in pMap:
                if pMap[pattern[i]] != sList[i]:
                    return False

            elif sList[i] in sSet:
                return False
            else:
                sSet.add(sList[i])
                pMap[pattern[i]] = sList[i]
        return True
             
