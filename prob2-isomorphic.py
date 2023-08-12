class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        hashmap1 = {}
        hashmap2 = {}

        for i,l in enumerate(s):
            if l not in hashmap1:
                hashmap1[l] = t[i]
            else:
                if hashmap1[l] != t[i]:
                    return False

        for i,l in enumerate(t):
            if l not in hashmap2:
                hashmap2[l] = s[i]
            else:
                if hashmap2[l] != s[i]:
                    return False

        return True