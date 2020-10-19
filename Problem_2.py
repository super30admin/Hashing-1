
"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach
I am using 2 dictionaries here, one for each string. We iterate through both the strings simultaneously 
and keep on checking both. We are using 2 dictionaries instead of 1, as when we use 1, we check d.values()
and it changes lookup Time Complexity to O(n) from O(1)
"""


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        d1 = {}
        d2 = {}
        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]
            if schar in d1:
                if d1[schar] != tchar:
                    return False
            else:
                d1[schar] = tchar
            if tchar in d2:
                if d2[tchar] != schar:
                    return False
            else:
                d2[tchar] = schar
        return True
