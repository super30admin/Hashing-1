"""
S30 FAANMG Problem #13 {Easy}


Problem 2
205. Isomorphic Strings

Time Complexity : O(N)
 

Space Complexity : O(1)
Constant Space of alphabets

Did this code successfully run on Leetcode : Yes


two hashmaps are used to cehck if :
    - All he occurrences of a character which must be replaced with another character 
      while preserving the order of characters. 
    - No two characters may map to the same character, but a character may map to itself.
        
Two if conditions are used to check if:
        The value in Smap is same as the value in the t string index
        And similarly value in the tMap is same as the value in the s strin
        
        If Nothen return false
        else True which is Isomorphic Strings
    
@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        sMap={}
        tMap={}
        
        s_size = len(s)
        t_size = len(t)
        
        
        if(s_size != 0 and t_size!=0 and s_size==t_size):
            for idx in range(s_size):
                
                if s[idx] in sMap and sMap[s[idx]] != t[idx]:
                    return False
                if t[idx] in tMap and tMap[t[idx]] != s[idx]:
                    return False
                sMap[s[idx]] = t[idx]
                tMap[t[idx]] = s[idx]
            return True
                    
        else:
            return False
 