#Time Complexity - O(N)
#Space Complexity - O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        h1 = {}
        h2 = {}
        if s == "" and t == "":
            return True 
        if s == "" or t == "":
            return False 
        if len(s)!=len(t):
            return False 
        for i in range(len(s)):
            if s[i] not in h1:
                h1[s[i]] = t[i]
            elif h1[s[i]] != t[i]:
                return False
            if t[i] not in h2:
                h2[t[i]] = s[i]
            elif h2[t[i]] != s[i]:
                return False
        return True 
            
