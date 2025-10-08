# 205. Isomorphic Strings

# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        
        STMap = dict()
        TSMap = dict()

        for i in range(len(s)):
            if s[i] not in STMap:
                STMap[s[i]] = t[i]
            elif STMap[s[i]] != t[i]:
                return False
            
            if t[i] not in TSMap:
                TSMap[t[i]] = s[i]
            elif TSMap[t[i]] != s[i]:
                return False
        
        return True
