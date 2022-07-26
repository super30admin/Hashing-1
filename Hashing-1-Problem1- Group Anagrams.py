"""
S30 FAANMG Problem #12 {Medium}

Problem 1
49. Group Anagrams

Time Complexity : O( N*klog k)
 

Space Complexity : O(N)
Constant Space 

Did this code successfully run on Leetcode : Yes


First Im trying to iterate throught the given str list

For each word in the list, 
    - Sorting the word
    -Checking if its present in the dict
        - If Yes then apend tye value to that sorted key
        - Create a new List
        

    
@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
       
        resdict= {}
        for idx, strVal in enumerate (strs):  # O(N)
            
            
            tempSorted = ''.join(sorted(strVal)) # O(k logk)
            
            
            if (tempSorted in  resdict): #O(k)
                resdict[tempSorted].append(strVal)
            else:
                resdict[tempSorted] = [strVal]
                
        
        return list(resdict.values())
        