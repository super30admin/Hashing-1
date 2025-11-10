#The solution implements a HashMap check if a string follows a given pattern.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        strList = s.split(" ")
        if len(pattern) != len(strList):
            return False
        patternMap = {}
        strMap = {}
        for i in range(len(pattern)):
            c = pattern[i]
            word = strList[i]
            if c in patternMap:
                if patternMap.get(c) != word:
                    return False
            else:
                patternMap[c] = word
            if word in strMap:
                if strMap.get(word) != c:
                    return False
            else:
                strMap[word] = c
        return True