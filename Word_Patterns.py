class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        d={}
        p={}
        
        l=s.split()
        
        if len(l)!=len(pattern):
            return False
        else:
            for i in range(len(pattern)):
                if pattern[i] not in d and l[i] not in p:
                    d[pattern[i]]=l[i]
                    p[l[i]]=1

            m=[]
            for i in pattern:
                if i in d:
                    m.append(d[i])


            if len(l)!=len(m):
                return False
            else:
                for i in range(len(l)):
                    if m[i]!=l[i]:
                        return False

            return True
                
        
        
                
                
        