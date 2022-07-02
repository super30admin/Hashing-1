# Time Complexity : O(N) //As it would run N number of time the words present
#  Space Complexity : O(N) //It would run for N letter present in dictionary
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:        
        #Define dictionary for hashmap
        dictIso = {}
        
        #Here I used set to detect unique alphabet and there length is equal or not if not return false        
        if len(set(s)) != len(set(t)):
            return False
        
        #Run a loop to fill our hash if the key,value pair is not there present already
        for i in range(len(s)):
            if s[i] not in dictIso:
                dictIso[(s[i])] = t[i]
            #If the hashmap doesn't already has the value present in it then we do not have a isomorphic solution
            if dictIso[(s[i])] != t[i]:
                return False
        return True