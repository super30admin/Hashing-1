# Time complexity - o(n) n is the length of s or t
# Space complexity - o(1) constant space in set and dictionary

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        hashMap = dict()
        hashSet = set()

        for i in range(len(s)):
            key = s[i]
            value = t[i]
            if key in hashMap:
                if hashMap[key] != value:
                    return False
            else:
                if value in hashSet:
                    return False
                else:
                    hashMap[key] = value
                    hashSet.add(value)
        return True
