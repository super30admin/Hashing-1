# https://leetcode.com/problems/isomorphic-strings/

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        keys = dict()
        values = dict()
        for i in range(len(s)):
            if s[i] in keys and keys[s[i]] != t[i]:
                return False
            else:
                if t[i] in values and values[t[i]] != s[i]:
                    return False
                keys[s[i]] = t[i]
                values[t[i]] = s[i]
        return True

#maintain 2 hashmaps for mapping. first hashmap has key-value pairs {s[i]:t[i]}. second hashmap with {t[i]:s[i]} pairs
#Time complexity O(n)
#space complexity O(1)