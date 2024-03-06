#T.C: O(N +M) where N is string and M is pattern
#S.C: O(1) 

class Solution:

    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(' ')
    
        if len(pattern) != len(s):
            return False

        dict_s = {}
        dict_p = {}

        for i in range(0, len(pattern)):
            pchar = pattern[i]
            schar = s[i]
        
            if pchar not in dict_p:
                if schar in dict_s:
                    return False
                else:
                    dict_p[pchar] = schar
                    dict_s[schar] = pchar
            else:
                if dict_p[pchar] != schar:
                    return False
        
        return True
