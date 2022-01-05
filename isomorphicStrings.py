
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        hash1  = {}
        hash2 = {}
        
        if len(s) != len(t):
            return False
        
        Flag =True
        for a in range(0,len(s)):
            
            if s[a] in hash1:
                if hash1.get(s[a]) != t[a]:
                    Flag = False
                    return False
            else:
                hash1[s[a]] = t[a]
            
            if t[a] in hash2:
                if hash2.get(t[a]) != s[a]:
                    Flag = False
                    return False
            else:
                hash2[t[a]] = s[a]
                    
        print(hash1)
        print(hash2)
        
        if Flag == True:
            return True
        else:
            return False
               