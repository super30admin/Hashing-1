# Time Complexity: O(n)

# Space Complexity: O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap={}
        tmap={}
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if s[i] not in smap:
                smap[s[i]]=t[i]
            else:
                if smap[s[i]]!=t[i]:
                    return False
            if t[i] not in tmap:
                tmap[t[i]] = s[i]
        if len(smap)==len(tmap):
            return True
        else:
            return False

        