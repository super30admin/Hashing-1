# Time Complexity : O(m+n) 
# Space Complexity : O(m+n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sDict = {}
        tSet = set()
        sArray = s.split()
        if len(pattern) != len(sArray):
            return False
        for sChar, tWord in zip(pattern, sArray):
            if sChar in sDict:
                if sDict[sChar] != tWord:
                    return False
            else:
                if tWord in tSet:
                    return False
                sDict[sChar] = tWord
                tSet.add(tWord)
        if len(sDict.values()) != len(set(sDict.values())):
            return False
        return True