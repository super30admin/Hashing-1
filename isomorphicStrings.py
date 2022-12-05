#Time Complexity :  O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

#Using two hashmaps
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap, tMap = {}, {}                         #creating hashmaps
        if len(s) != len(t):    return False        #check if length are not same return False
        
        for i in range(len(s)):                     #iterate over one of the strings
            sChar, tChar = s[i], t[i]               #get the characters to compare from two strings
            if sChar in sMap.keys():                #check if sChar is in sMap.keys()
                if sMap[sChar] != tChar:            #if it is there and its value doesnt match tChar
                    return False                    #return False
            else:                                   
                sMap[sChar] = tChar                 #else we add the mapping from sChar: tChar in sMap
                
            if tChar in tMap.keys():                #check if tChar is in tMap.keys()
                if tMap[tChar] != sChar:            #if its there and its value doesnt match sChar
                    return False                    #return False
            else:
                tMap[tChar] = sChar                 #else we add the mapping from tChar: sChar in tMap
                
        return True                                 #if we dont hit False else where we hit this line

#Using Hashmap and Hashset
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap, tSet = {}, set()                  #use hashmap and hashSet
        
        if len(s) != len(t): return False       #base case length check
        
        for i in range(len(s)):                 
            sChar, tChar = s[i], t[i]           #get two characters from the strings
            if sChar in sMap.keys():            #check if sChar is in keys
                if sMap[sChar] != tChar:        #if sChar is not mapped to tChar return False
                    return False
            else:                               #if sChar not in keys we add it
                sMap[sChar] = tChar             #map sChar: tChar
                if tChar not in tSet:           # we add tChar to tSet it its not present
                    tSet.add(tChar)
                else:                           #if it is present then it is mapped to some other char
                    return False                #so we return False
        return True