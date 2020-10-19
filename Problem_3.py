"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach
This question is similar to isomorphic strings.
I am using 2 dictionaries here, one for each string. We iterate through both the strings simultaneously 
and keep on checking both. We are using 2 dictionaries instead of 1, as when we use 1, we check d.values()
and it changes lookup Time Complexity to O(n) from O(1)
"""


class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        arr = s.split()
        if len(pattern) != len(arr):
            return False
        d1 = {}
        d2 = {}
        for i in range(len(pattern)):
            p = pattern[i]
            q = arr[i]
            if p in d1:
                if d1[p] != q:
                    return False
            else:
                d1[p] = q
            if q in d2:
                if d2[q] != p:
                    return False
            else:
                d2[q] = p
        return True
