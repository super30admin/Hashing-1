# https://leetcode.com/problems/word-pattern/
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        stringList = s.split()
        keyHashMap = dict()
        valueHashMap = dict()
        if len(pattern) != len(stringList):
            return False
        if len(set(pattern)) != len(set(stringList)):
            return False
        for i in range(len(pattern)):
            if (pattern[i] in keyHashMap) and (keyHashMap[pattern[i]] != stringList[i]):
                return False
            else:
                if (stringList[i] in valueHashMap) and (valueHashMap[stringList[i]] != pattern[i]):
                    return False
                valueHashMap[stringList[i]] = pattern[i]
            keyHashMap[pattern[i]] = stringList[i]
        return True

#maintain 2 hashmaps for mapping. first hashmap has key-value pairs {pattern[i]:s[i]}. second hashmap with {s[i]:pattern[i]} pairs
#Time complexity O(n)
#space complexity O(1)