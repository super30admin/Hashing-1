# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Using two maps, first we check if s is an isomorphic string to t and then if t is an isomorphic string to s

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = {}
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]

            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
            else:
                sMap[sChar] = tChar

            if tChar in tMap:
                if tMap[tChar] != sChar:
                    return False
            else:
                tMap[tChar] = sChar

        return True