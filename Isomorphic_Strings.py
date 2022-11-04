class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        d = {}
        l = []
        
        for i in range(len(s)):
            
            if s[i] not in d and t[i] not in l:
                d[s[i]] = t[i]
                l.append(t[i])
            elif s[i] in d:
                if d[s[i]] != t[i]:
                    return False
            else:
                return False
                
        return True
