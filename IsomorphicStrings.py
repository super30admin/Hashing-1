class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if (s==None or t==None):
            return False
        if(len(s)!=len(t)):
            return False
        hashmap={}
        hashset=set()
        for i in range(len(s)):
            if s[i] in hashmap.keys():
                if hashmap[s[i]]!=t[i]:
                    return False
            else:
                if t[i] in hashset:
                    return False
                hashmap[s[i]]=t[i]
                hashset.add(t[i])
        return True
                
        