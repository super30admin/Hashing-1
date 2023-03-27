#Time Complexity: O(n) where  n is the length of the pattern string or the length of the string s, whichever is shorter.
#Space Complexity: O(n) 

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sArray = s.split(' ')
        
        if len(pattern) != len(sArray):
            return False
        
        p_map = {}
        s_map = {}

        for i in range(len(pattern)):
            pchar = pattern[i]
            schar = sArray[i]

            if schar not in s_map and pchar not in p_map:
                s_map[schar] = [pchar]
                p_map[pchar] = [schar]
            elif s_map.get(schar) != pchar or p_map.get(pchar) != schar:
                return False
            
        return True

