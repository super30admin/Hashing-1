#https://leetcode.com/problems/isomorphic-strings/description/
#Time Complexity:0(n)
# Space Complexity:O(1) Characters come from ASCII, which has only 256 possible characters total.
#Did it run on LeetCode: Yes
#Code Logic: here I created 2 hshmaps using dictionary to store the mappind first
#later, checked the index of each element in both the strings 
#after that, I checked the mappings in both directions, if there were conflicts i return False, if mapping was not found then i created new mapping & if there were no conflicts then I return True  

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = {}                  #creating to empty maps using dictionary
        tmap ={}
        
        for i in range(len(s)):     #we will check the index postion of each character in both s and t
            sChar = s[i]
            tChar = t[i]
           
            if sChar in smap:               #we will s to t direction
                if smap[sChar]!=tChar:      #if s to t direction does not match return false
                   return False 
            else: 
                smap[sChar] = tChar         #if it never exister before then record new s to t mapping
            
            if tChar in tmap:
                if tmap[tChar]!= sChar:     #if t to s direction does not match return false
                    return False
            else: 
                tmap[tChar]= sChar          #if it never exister before then record new t to s mapping
        return True                         #if there are no conflicts found then it is ispmorphic