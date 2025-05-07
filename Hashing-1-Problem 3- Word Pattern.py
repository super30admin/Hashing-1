"""
 FAANMG Problem #14 {Easy}


Problem 3
290. Word Pattern

Time Complexity : O(N)
 

Space Complexity : O(1)
Constant Space of alphabets map

Did this code successfully run on Leetcode : Yes


two hashmaps are used to check if :
    - All the occurrences of a character must be replaced with another word 
      while preserving the order of characters. 
    - No two characters may map to the same word
 
First the pattern string is split by the " " space and stored in List
       
Two if conditions are used to check if:
        The value in Smap is same as the value in the pattern List index
        And similarly word in the pMap is same as the char value 
        
        If No then return false
        else True 
    
@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        sList= s.split()
        sList_size= len(sList)
        pattern_size= len(pattern)
        
        if(sList_size==pattern_size):
        
            sMap={}
            pMap={}
            for idx, char in enumerate(pattern):

                if (char in sMap and sMap[char]!=sList[idx] ):
                    return False
                if (sList[idx] in pMap and pMap[sList[idx]]!=char ):
                    return False
                sMap[char]=sList[idx]
                pMap[sList[idx]]=char
            return True
        else:
            return False