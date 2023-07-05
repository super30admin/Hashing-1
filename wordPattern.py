#Time Complexity - O(N)
#Space Complexity - O(1)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        h1 = {}
        h2 = {}
        t = s.split()
        if pattern == "" and t == "":
            return True 
        if pattern == "" or t == "":
            return False 
        if len(pattern)!=len(t):
            return False 
        for i in range(len(pattern)):
            if pattern[i] not in h1:
                h1[pattern[i]] = t[i]
            elif h1[pattern[i]] != t[i]:
                return False
            if t[i] not in h2:
                h2[t[i]] = pattern[i]
            elif h2[t[i]] != pattern[i]:
                return False
        return True 
            
        