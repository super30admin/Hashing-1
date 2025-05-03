#Isomorphic Strings#
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        mapS={}
        mapT={}
        for i in range(len(s)):
            if s[i] not in mapS:
                mapS[s[i]]=t[i]
            elif mapS[s[i]]!=t[i]:
                return False
            if t[i] not in mapT:
                mapT[t[i]]=s[i]
            elif mapT[t[i]]!=s[i]:
                return False
        return True