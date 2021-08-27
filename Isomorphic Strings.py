class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        # sMap = dict()
        # tMap = dict()
        sMap = []
        tMap = []

        for x in range(len(s)):
            sChar = s[x]
            tChar = t[x]

            if sMap[sChar - ' '] != 0:
                if sMap[sChar - ' '] != tChar:
                    return False
                else:
                    sMap[sChar - ' '] = tChar
            if tMap[tChar - ' '] != 0:
                if tMap[sChar - ' '] != sChar:
                    return False
                else:
                    tMap[tChar - ' '] = sChar
        return True

# obj = Solution()

# print(obj.isIsomorphic('foo','bar'))
