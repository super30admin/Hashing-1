# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        res = {}
        if len(s) != len(t):
            return False
        
        for i in range(0, len(s)):
            ss = s[i]
            tt = t[i]

            ss = 'first'+ss
            tt = 'second'+tt

            if ss not in res:
                res[ss] = i
            
            if tt not in res:
                res[tt] = i
            
            if res[ss] != res[tt]:
                return False
        return True
        