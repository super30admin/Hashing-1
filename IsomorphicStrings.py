# Time Complexity : O(n) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sDict = {}
        # tDict = {}
        tSet = set()
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            if sChar in sDict:
                if sDict[sChar] is not tChar:
                    return False
            else:
                if tChar in tSet:
                    return False
                sDict[sChar] = tChar
                tSet.add(tChar)

            # if tChar in tDict:
            #     if tDict.get(tChar) is not sChar:
            #         return False
            # else: 
            #     tDict[tChar] = sChar
        return True