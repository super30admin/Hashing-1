# Time Complexity : O(n)
# Space Complexity : O(n)
# Leetcode : Pass
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mainDict = {}
        crossDict = {}
        for i in range(len(s)):

            # if encountering first time
            if mainDict.get(s[i]) is None and crossDict.get(t[i]) is None:
                mainDict[s[i]] = t[i]
                crossDict[t[i]] = s[i]
            # if already in the data, skipping the loop
            elif mainDict.get(s[i]) == t[i] and crossDict.get(t[i]) == s[i]:
                continue

            # in the both dict but mismatching the entries
            else:
                return False
        return True
