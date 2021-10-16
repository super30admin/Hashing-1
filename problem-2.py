#Time Complexity: O(n)
#Space Complexity: O(n)
#Problem sucessfully accepted in leetcode: yes
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        StoTmap={}
        TtoSmap={}
#If length of s and t are not equal,return false
        if (len(s)!=len(t)):
            return False
#Map each element from S to T in hashmap
        for i in range(len(s)):
            if s[i] not in StoTmap:
                StoTmap[s[i]]=t[i]
            else:
#If current char of s is mapped to different char from t already, return False
                if StoTmap[s[i]]!=t[i]:
                    return False
#Repeat the process for see if each char from t maps to s
        for i in range(len(t)):
            if t[i] not in TtoSmap:
                TtoSmap[t[i]]=s[i]
            else:
                if TtoSmap[t[i]]!=s[i]:
                    return False
                
        return True