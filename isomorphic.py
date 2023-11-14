class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t) or len(s)==0 or len(t)==0:
            return False
        
        dic={}
        se = set()
        
        for i in range(0,len(s)):
            if s[i] not in dic:
                if t[i] not in se:
                    dic[s[i]]=t[i]
                    se.add(t[i])
                
                else:
                    return False
            
            else:
                if dic[s[i]]!= t[i]:
                    return False
                
        return True
                
                
    
        