# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA


# Approach is to create a two hashmap and push the map in source and target if the pair is not avilable in any of the hashmap would lead to non isomorphic.

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        d={}
        if(len(s)!=len(t)):
            return False
        for i in range(0,len(s)):
            if(s[i] in d):
                if (d[s[i]]!=t[i]):
                    return False  
            else:    
                d[s[i]]=t[i]
                
        if(len(set(d.values()))!= len(d.values())):        
            return False
                
        return True