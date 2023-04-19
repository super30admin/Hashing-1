#Time Complexity:O(nk)
#Space Complexity:O(1)
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s=s.split(" ")
        if len(s)!=len(pattern):
            return False
        strToPattern={}
        patternToStr={}
        for i in range(len(pattern)):
            if pattern[i] in strToPattern:
                if patternToStr.get(s[i])!=pattern[i]:
                    return False
            else:
                if s[i] in patternToStr:
                    return False
            strToPattern[pattern[i]]=s[i]
            patternToStr[s[i]]=pattern[i]
        return True
