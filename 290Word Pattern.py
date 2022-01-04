 #Word Pattern - Leetcode 290
# T.C => O(n)
# S.C => O(n)
# Approach:- We made two dictionary to store value of corresponding patter and s. Then we traverse through the patter and checked the values in both the map.
# If the values gets mapped correctely in both the diction then return true or else return false



class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if len(pattern) == None: return False
        pmap = {}
        smap = {}
        stringArray = s.split(" ")
        if len(pattern) != len(stringArray):
            return False
        
        for i in range(0, len(pattern)):
            c = pattern[i]
            value = stringArray[i]
            if c in pmap:
                if(pmap.get(c) != value):
                    
                    return False
            else:
                pmap[c] = value
                
            if value in smap:
                if smap.get(value) != c:
                    return False
            else:
                smap[value] = c
        return True