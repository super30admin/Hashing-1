#TC= O(n)
#SC = O(1)
# if runs successfully on leetcode: YES

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dictStoT = {}
        dictTtoS = {}
    

        for i in range(0, len(s)):
            if s[i] not in dictStoT:
                dictStoT[s[i]] = t[i]
            else:
                if dictStoT[s[i]] != t[i]:
                    return False
            
            if t[i] not in dictTtoS:
                dictTtoS[t[i]] = s[i]
            else:
                if dictTtoS[t[i]] != s[i]:
                    return False
        return True