#Time Complexity :O(n), Where n is number of elements(chars) in the 's'
#Space Complexity :O(n), Where n is number of elements(chars) in the 's'
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : Not anything specific
'''Approach:
This is very similar to isomorphic problem, except we have convert the element in the string s into array of strings
''' 
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        #In s ' ' acts as delimiter
        tmp=s.split(' ')
        #print(tmp)
        #Now the problem is very similar to isomorphism problem
        fmap={}
        smap={}
        if(len(pattern)!=len(tmp)):
            return False
        else:
            #Here both iterables have same length
            for i in range(len(tmp)):
                felement=pattern[i]
                selement=tmp[i]
                #Checking in the first hasmap
                if(felement in fmap):
                    
                    #Here felement is in the first hashmap. Therefore, we have check value of the key
                    if(fmap[felement]!=selement):
                        return False                    
                else:
                    #We have to insert felement into the first hashmap
                    fmap[felement]=selement
                
                #Checking in the second hashmap    
                if(selement in smap):
                    #Here felement is in the first hashmap. Therefore, we have check value of the key
                    if(smap[selement]!=felement):
                        return False
                else:
                    #We have to insert selement into the second hashmap
                    smap[selement]=felement    
            return True
                    
                