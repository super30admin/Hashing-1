#Time Complexity :O(n), Where n is number of elements(chars) in the strings
#Space Complexity :O(n), Where n is number of elements(chars) in the strings
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : Not anything specific
'''Approach:
For Isomorphic strings, We map first string char with second string char in One Haspmap and Similarly we map second string char with first string char in another Hashmap.
In every iteration we just check this mapping is not violted in both Hashmaps 
''' 


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(len(s)==len(t)):
            n=len(s)
            #Here we need two hashmap such one hashmap maps it string elements(keys) to corresponding elements in other strings
            sdict={}
            tdict={}
            for i in range(n):
                svalue=s[i]
                tvalue=t[i]
                
                if(sdict.get(svalue,None)==None):
                    #Here the key is not present, Therefore we have to add the key later check in the second hashmap
                    sdict[svalue]=tvalue
                    if(tdict.get(tvalue,None)==None):
                        #Here it is not present in the second hashmap
                        tdict[tvalue]=svalue
                    elif(tdict.get(tvalue,None)==svalue):
                        #Here the key is mapped to svalue
                        continue
                    else:
                        #Since the key is not mapped svalue
                        return False
                elif(sdict.get(svalue,None)==tvalue):
                    #Here the key is present, and it is associted with correseponding value, Then we have to check other way round
                    if(tdict.get(tvalue,None)==svalue):
                        #Here the key is mapped to svalue 
                        continue 
                    elif(tdict.get(tvalue,None)==None):
                        #Here it is not present in the second hasmap 
                        tdict[tvalue]=svalue
                    else:
                        #Here the key is not mapped to svalue
                        return False
                else:
                    return False
            return True
                    
                
                
        else:
            #Here definetly both of the strings don't have same lenght 
            return False