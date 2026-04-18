class Solution:
    def isIsomorphic(self, s, t):
        if len(s) != len(t):
            return False
        sMap = {}
        tSet = set()
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
            else:
                if tChar in tSet:
                    return False
                sMap[sChar] = tChar
                tSet.add(tChar)
        return True
    

s = "f11"
t = "b23"
sl = Solution()
print(sl.isIsomorphic(s,t))