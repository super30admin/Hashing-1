#Time Complexity : O(N)
#Space Complexity :  O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

#Approach:  I used two hash maps to track the mapping from s to t and t to s,
# making sure the mapping is consistent and one-to-one. I returned False as soon as a mismatch was found, 

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        dict_s_t = {}
        dict_t_s = {}

        if len(s) != len(t):
            return False

        for i in range(0,len(s)):
            if s[i] not in dict_s_t:
                dict_s_t[s[i]] = t[i]
            elif dict_s_t[s[i]] != t[i]:
                return False
            if t[i] not in dict_t_s:
                dict_t_s[t[i]] = s[i]
            elif dict_t_s[t[i]] != s[i]:
                   return False
        return True

            

            
            

        
        
        
        
            