class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t): return False
        res = {}
        for index, char in enumerate(t):
            if char not in res:
                if s[index] not in res.values():
                    res[char] = s[index]
                else:
                    return False
            elif res[char] != s[index]:
                return False
        return True
