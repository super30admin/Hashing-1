#Time complexity is O(n)
#space complexity is O(1)


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t): return False
        sdict={}
        tdict={}

        for i in range(0,len(s)):

            if s[i] in sdict:
                if sdict[s[i]]!=t[i]:
                
                    return False
            else:
                    sdict[s[i]]=t[i]
        
            if t[i] in tdict:
                if  tdict[t[i]]!=s[i]: 
                
                    return False
            else:
                    tdict[t[i]]=s[i]
        return True 
