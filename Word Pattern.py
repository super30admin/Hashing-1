class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        
        sMap = {}
        pMap = {}
        input_str = str.split()
        
        len_pattern = len(pattern)
        len_str = len(input_str)
        if(len_pattern != len_str):
            return False
        
        for i in range(0, len(pattern)):
            s = pattern[i]
            p = input_str[i]
            if s not in sMap.keys():
                sMap[s] = p
            elif(sMap[s] != p):
                return False
            if p not in pMap.keys():
                pMap[p] = s
            elif(pMap[p] != s):
                return False
        return True
