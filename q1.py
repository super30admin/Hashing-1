from typing import List
#Time Complexity :O(m*klog(k)), Where m is number of elements(chars) in the strings, k is the average length of the strings in the input
#Space Complexity :O(m)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : Not anything specific
'''Approach:
For Group Anagrams approach is to make sure that all anagrams are mapped to same key by the hashfuntion. 
''' 

class Solution:
    #This function acts as hashfunction when it returns key of the given string, Time Complexity of O(n*log(n))
    def hashfunction(self,s: str)->int:
        val = ''.join(sorted(s))#Actually this takes O(n*log(n)), Where n is the size of the string
        return val
    
    #The Followinng function is the actual solution
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hmap={}
        for i in strs:
            key=self.hashfunction(i)
            if(key in hmap):
                hmap[key].append(i)
            else:
                hmap[key]=[i]
                
        #print(hmap)
        output=[]
        for i in hmap.values():
            output.append(i)
        return output