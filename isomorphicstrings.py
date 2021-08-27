"""
TC:O(n)
SC:O(1)
:return
Determine if the two strings are isomorphic
"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap=dict()
        tmap=dict()
        for i in range(len(s)):
            if s[i] in smap.keys():
                if smap.get(s[i]) != t[i]:
                    return False
            else:
                smap[s[i]]=t[i]

            if t[i] in tmap.keys():
                if tmap.get(t[i]) != s[i]:
                    return False
            else:
                tmap[t[i]] = s[i]

        return True

        # return 0



s="egg"
t="add"
solve=Solution()
print(solve.isIsomorphic(s,t))