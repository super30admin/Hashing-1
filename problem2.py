## Problem 2:
#Given two strings s and t, determine if they are isomorphic.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map_dict = {

        }
        check_set = set()
        if len(s) != len(t):
            return False 
        for i in range(len(s)):
            if s[i] not in map_dict:
                if t[i] not in check_set:
                    map_dict[s[i]]=t[i]
                    check_set.add(t[i])
                else:
                    return False
            else:
                if map_dict[s[i]] != t[i]:
                    return False 
        return True