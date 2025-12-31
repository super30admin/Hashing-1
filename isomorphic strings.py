class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map_s={}
        map_t={}
        if len(s)!=len(t):
            return False
        
        for i in range(len(s)):
            if s[i] not in map_s:
                map_s[s[i]]=t[i]
            else:
                if map_s[s[i]]!=t[i]:
                    return False
        for i in range(len(s)):
            if t[i] not in map_t:
                map_t[t[i]]=s[i]
            else:
                if map_t[t[i]]!=s[i]:
                    return False
        return True
        