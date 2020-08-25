class Solution(object):
    def isIsomorphic(self, pattern, str):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        sMap = {}
        pMap = {}
        
        len_pattern = len(pattern)
        len_str = len(str)
        if(len_pattern != len_str):
            return False
        
        for i in range(0, len(pattern)):
            s = pattern[i]
            p = str[i]
            if s not in sMap.keys():
                sMap[s] = p
            elif(sMap[s] != p):
                return False
            if p not in pMap.keys():
                pMap[p] = s
            elif(pMap[p] != s):
                return False
        return True
