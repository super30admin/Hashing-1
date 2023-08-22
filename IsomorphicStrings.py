#Time Complexity : O(N) where N is the length of the string
#Space Complexity : O(1) since in the worst case, the length of the dictionary array would be 256 which we can still consider as a constant
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: To check if s & t and t & s are isomorphic, brute force would be an iterative approach. To optimize this we can use hashmap/dictionary
#Here, we require 2 maps to check both s & t and t & s mapping (smap and tmap). We iterate once through the characters in s and t strings
#If the schar is present in smap, we check if the value for that schar is equal to the tchar, if not return false. If schar is not present, 
#we map it in the dictionary with key as schar and tchar as the value. This is for s -> t mapping 
#We repeat the above steps for t -> s mapping. In the end we return True.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s is None and t is None: return True
        if s is None or t is None: return False
        smap = {}
        tmap = {}
        for i in range (0, len(s)):
            schar = s[i]
            tchar = t[i]
            if schar in smap:
                if smap[schar] != tchar: return False
            else:
                smap[schar] = tchar

            if tchar in tmap:
                if tmap[tchar] != schar: return False
            else:
                tmap[tchar] = schar
        return True