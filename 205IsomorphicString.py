#Time Complexity: O(n) as we need to traverse the strings once.
#Space Complexity: O(n) where n is the length of string

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) and len(t) == 0:
            return False
        elif len(s) != len(t):
            return False
        
        smap = {}
        tmap = {}
        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]
            if s[i] not in smap and t[i] not in tmap:
                smap[s[i]].append(t[i])
                tmap[t[i]].append(s[i])
            elif smap.get(schar) != tchar or tmap.get(tchar) != schar:
                return False
            
        return True
            
