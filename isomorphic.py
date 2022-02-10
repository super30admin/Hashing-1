# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict1 = {}
        if len(set(s)) != len(set(t)):
            return False
        for i in range(len(s)):
            value = dict1.get(s[i])
            if value is not None:
                if t[i] != value:
                    return False
            else:
                dict1[s[i]] = t[i]
        return True