# TC - O(N), n is length of s and t

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # if len(s) == 0 or len(t) == 0:
        #    return ""

        if len(s)!= len(t):
            return False

        sMap = {}
        tMap = {}

        for i in range(len(s)): #can be length of t also
            if s[i] not in sMap:
                sMap[s[i]] = t[i]
            else:
                if sMap[s[i]] != t[i]:
                    return False
            
            
            if t[i] not in tMap:
                tMap[t[i]] = s[i]
            else:
                if tMap[t[i]]!= s[i]:
                    return False
        return True