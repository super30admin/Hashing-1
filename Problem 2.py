class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t): return False
        hashmap_s = {}
        seen_t = set()

        for i in range(len(s)):
            if s[i] in hashmap_s:
                if hashmap_s[s[i]]!=t[i]:
                    return False
            else:
                if t[i] in seen_t: 
                    return False
                
                seen_t.add(t[i])
                hashmap_s[s[i]]=t[i]
        return True
