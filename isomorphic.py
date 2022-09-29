##Time Complexity : O(n)
##Space Complexity : O(1)
##Did this code successfully run on Leetcode : Yes
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        map1, map2 = {} , {}
        
        for c1, c2 in zip(s, t):
            if ((c1 in map1 and map1[c1]!= c2) or (c2 in map2 and                       map2[c2]!=c1)):
                return False
            map1[c1]=c2
            map2[c2]=c1
        return True