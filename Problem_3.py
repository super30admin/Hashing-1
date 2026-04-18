class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_arr = s.split(" ")
        if len(pattern) != len(s_arr):
            return False
        patternMap = {}
        sSet = set()
        for i in range(len(pattern)):
            pChar = pattern[i]
            s_word = s_arr[i]
            if pChar in patternMap:
                if patternMap[pChar] != s_word:
                    return False
            else:
                if s_word in sSet:
                    return False
                patternMap[pChar] = s_word
                sSet.add(s_word)
        return True
