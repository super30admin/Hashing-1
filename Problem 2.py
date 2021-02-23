#Time Complexity : O(1)
# Space Complexity : O(1)


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) == 1:
            return True

        charDict = {}

        for i in range(0, len(s)):
            if s[i] not in charDict.keys():
                if t[i] not in charDict.values():
                    charDict[s[i]] = t[i]
                else:
                    return False
            else:
                if charDict[s[i]] != t[i]:
                    return False
        return True