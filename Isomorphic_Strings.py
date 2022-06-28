class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d={}
        p={}
        for i in range(len(s)):
            if s[i] not in d and t[i] not in p:
                d[s[i]]=t[i]
                p[t[i]]=1
         
        l=''
        for i in s:
            if i in d:
                l+=d[i]
            
        if l==t:
            return True
        
        return False
            
            
        
        