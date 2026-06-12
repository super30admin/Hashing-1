# Leetcode https://leetcode.com/problems/isomorphic-strings/
# Time Complexity O(n)
# Space Complexity O(1)

# solution 1
def isIsomorphic(self, s: str, t: str) -> bool:
    sMap = dict()
    tMap = dict()
    for i in range(0, len(s)):
        sChar = s[i]
        tChar = t[i]
        if sChar in sMap:
            if sMap[sChar] != tChar:
                return False
        else:
            sMap[sChar] = tChar
        if tChar in tMap:
            if tMap[tChar] != sChar:
                return False
        else:
            tMap[tChar] = sChar
    return True
s = "egg", t = "add"