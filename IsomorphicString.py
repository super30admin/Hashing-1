#205. Isomorphic Strings
"""
Time Complexity :
Space Complexity :
Success in Leetcode? :
Any problem faced? :
"""

class Solution:
    def helper(self, x, y, l) -> bool:
        d = dict()
        for i in range(0, l):
            if x[i] in d:
                if d.get(x[i]) != y[i]:
                    return False
            else:
                d.update({x[i]: y[i]})

        return True

    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        if self.helper(s, t, len(s)):
            if self.helper(t, s, len(s)):
                return True
            else:
                return False

        else:
            return False
