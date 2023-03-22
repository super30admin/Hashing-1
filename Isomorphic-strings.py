# Time Complexity : O(n) as we iterate through string
# Space Complexity : O(n) as we store the key value pair
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
"""
keep 1 hashmap and 1 hashset. create 1 to 1 mapping of s string to t string. 
If the s string char appears again and the value is different return false.
if the key is unique but value has appeared before, check if the value is there in hashset, if it is there return false
"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        sMap = {}
        tMap = set()
        for i in range(len(s)):
            if s[i] in sMap:
                if sMap[s[i]] != t[i]:
                    return False
            elif t[i] in tMap:
                return False
            else:
                sMap[s[i]] = t[i]
                tMap.add(t[i])

        return True
