# https://leetcode.com/problems/word-pattern/

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        my_hash = {

        }
        my_set = set()
        if len([x for x in pattern]) != len(s.split(' ')):
            return False
        for s_map,w_map in zip([x for x in pattern],s.split(' ')):
            if s_map in my_hash:
                if my_hash[s_map] != w_map:
                    return False 
            else:
                if w_map in my_set:
                    return False 
                else:
                    my_hash[s_map] = w_map
                    my_set.add(w_map) 
        return True
        