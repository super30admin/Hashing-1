#Time Complexity :  O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

#Using two hashmaps
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(' ')                            #split the input string by space
        if not s or not pattern: return False       #null check
        if len(s) != len(pattern): return False     #base case check
        
        hashmap1, hashmap2 = {}, {}
        for i in range(len(pattern)):               #iterate over pattern
            sChar, pStr = s[i], pattern[i]          #get the character and string
            if pStr in hashmap1.keys():             #if pStr is in hashmap keys      
                if hashmap1[pStr] != sChar:         #if it does not match with sChar
                    return False                    #return False
            else:
                hashmap1[pStr] = sChar              #if pStr is not in hashmap then we add pStr: sChar
            
            if sChar in hashmap2.keys():            #if sChar is in hashmap keys      
                if hashmap2[sChar] != pStr:         #if it does not match with pStr
                    return False                    #return False
            else:
                hashmap2[sChar] = pStr              #if sChar is not in hashmap then we add sChar: pStr
            
        return True

#Using Hashmap and Hashset
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(' ')                            #split the input string by space
        if not s or not pattern: return False       #null check
        if len(s) != len(pattern): return False     #base case check
        hashmap, hashset = {}, set()
        for i in range(len(pattern)):               #iterate over pattern
            sChar, pStr = s[i], pattern[i]          #get the character and string
            if pStr in hashmap.keys():              #if pStr is in hashmap keys      
                if hashmap[pStr] != sChar:          #if it does not match with sChar
                    return False                    #return False
            else:
                if sChar not in hashset:            #if the sChar isnt in hashset
                    hashmap[pStr] = sChar           #we add and map pStr: sChar
                    hashset.add(sChar)              #add sChar to hashSet
                else:
                    return False                    #if it is in hashset then it is mapped to some other string
        return True