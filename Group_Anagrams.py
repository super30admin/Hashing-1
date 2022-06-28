class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primes=[2,3,5,7,11,13,17,19,23,29,31,37,41,47,53,59,61,67,71,73,79,83,89,97,101,103]
        
        l=[]
        
        for i in strs:
            prod=1
            for k in range(len(i)):
                prod*=primes[ord(i[k])-ord('a')]
            l.append(prod)
            
        d={}
        
        for i in range(len(l)):
            if l[i] not in d:
                d[l[i]]=[]
                
            d[l[i]].append(strs[i])
            
        p=[]
        for i in d.values():
            p.append(i)
            
        return p
            
                
                
        