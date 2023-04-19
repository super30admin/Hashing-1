class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        stMap={}
        tsMap={}
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if s[i] in stMap:
                if tsMap.get(t[i])!=s[i]:
                    return False
            else:
                if t[i] in tsMap:
                    return False
            stMap[s[i]]=t[i]
            tsMap[t[i]]=s[i]
        return True
