class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        strArray = s.split(' ')
        if len(pattern) != len(strArray):
            return False
        patternMap = {}
        sMap = {}
        for i in range(len(pattern)):
            patternChar = pattern[i]
            sString = strArray[i]
            if patternMap.get(patternChar) != None:
                if patternMap[patternChar] != sString:
                    return False
            else:
                patternMap[patternChar] = sString
            if sMap.get(sString) != None:
                if sMap[sString] != patternChar:
                    return False
            else:
                sMap[sString] = patternChar
        return True
    
    
    
    #Time complexity will be O(n)
    #Space Complexity will be O(1)