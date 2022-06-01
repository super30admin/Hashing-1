"""
TC: O(n)
SC: O(n)
"""
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        return self.getScore(pattern,False) == self.getScore(s,True)
        
    def getScore(self, string, isArray):
        listVal = string
        if isArray:
            listVal = string.split(" ")
        dict_ = {}
        res= []
        for idx, c in enumerate(listVal):
            if c not in dict_:
                dict_[c] = idx
            res.append(dict_[c])
        
        return "".join(str(res))
