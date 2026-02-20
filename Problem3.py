# Word Pattern

# similar to isopmorphic, here characters in patterns are isomorphic to the str. So maintain two way map and validate mapping remains consistent
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        lengthPattern = len(pattern)
        arrayS = s.split(" ")
        lengthS = len(arrayS)
        if lengthS != lengthPattern:
            return False
        charToStrMap = {}
        strToCharMap = {}
        for i in range(0,lengthPattern):
            key = pattern[i]
            if key in charToStrMap:
                if charToStrMap[key] != arrayS[i]:
                    return False
            else:
                charToStrMap[key] = arrayS[i]

            key = arrayS[i]
            if key in strToCharMap:
                if strToCharMap[key] != pattern[i]:
                    return False
            else:
                strToCharMap[key] = pattern[i]
        return True