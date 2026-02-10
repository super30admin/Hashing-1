# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Store mappings of s to t in an array and track the mapped values. 

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = ['\0'] * 100
        sMappedValues = [False] * 100

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]

            if sMap[ord(sChar) - ord(' ')] != '\0':
                if sMap[ord(sChar) - ord(' ')] != tChar:
                    return False
            else:
                if sMappedValues[ord(tChar) - ord(' ')]:
                    return False
                sMap[ord(sChar) - ord(' ')] = tChar
                sMappedValues[ord(tChar) - ord(' ')] = True

        return True