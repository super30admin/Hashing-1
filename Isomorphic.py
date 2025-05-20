# There will be two hash tables. s->t and t->s mapping every character. If there is any discripency in any mappings then return False else return True.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s)!=len(t):
            return False

        hashS = {}
        hashT = {}

        for i in range(len(s)):

            # Map s -> t
            if s[i] in hashS:
                if hashS[s[i]]!=t[i]:
                    return False
            else:
                hashS[s[i]]=t[i]

            # Map t-> s
            if t[i] in hashT:
                if hashT[t[i]]!=s[i]:
                    return False
            else:
                hashT[t[i]]=s[i]

        return True