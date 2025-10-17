class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sList = s.split(' ')
        if len(sList) != len(pattern):
            return False
        patternMap = {}
        sSet = set()

        for i in range(len(pattern)):
            pattern_char = pattern[i]
            word = sList[i]
            if pattern_char in patternMap:
                if patternMap[pattern_char] != word:
                    return False
            else:
                if word in sSet:
                    return False
                patternMap[pattern_char] = word
                sSet.add(word)
        return True