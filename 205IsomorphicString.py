#Word Pattern - Leetcode 290
# T.C => O(n)
# S.C => O(n)
# Approach:- We made two dictionary to store value of corresponding s and t. Then we traverse through the s and checked the values in both the map.
# If the values gets mapped correctely in both the diction then return true or else return false
 

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        smap = {}
        tmap = {}
        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]
            if schar in smap:
                if smap.get(schar) != tchar:
                    return False
            else:
                smap[schar] = tchar
                
            if tchar in tmap:
                if tmap.get(tchar) != schar:
                    return False
            else:
                tmap[tchar] = schar
                
        return True