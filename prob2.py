# Time Complexity : O(n)
# Space Complexity :O(n)
# Leet Code: Yes

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False

        hashset = set()
        hashmap = {}
        n = len(s)
        for i in range(n):
            if s[i] not in hashmap and t[i] not in hashset:
                hashmap[s[i]] = t[i]
                hashset.add(t[i])

            elif s[i] not in hashmap and t[i] in hashset:
                return False

            elif hashmap[s[i]] != t[i]:
                return False
        
        return True