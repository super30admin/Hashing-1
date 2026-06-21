'''
Create a hashmap and put the mapping of the char of s and t at the same position
s[i] : t[i]

If char in s is already mapped to a char, and a new mapping is seen then return false

Repeat the same with the hashmap containing the mapping t[i]: s[i]

If both mappings are correct then return true

Time Complexity: O(n)
Space Complexity: O(n)
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hMap = {}

        for i in range(len(s)):
            if s[i] in hMap and t[i] != hMap[s[i]]:
                return False
            else:
                hMap[s[i]] = t[i]

        hMap = {}

        for i in range(len(s)):
            if t[i] in hMap and s[i] != hMap[t[i]]:
                return False
            else:
                hMap[t[i]] = s[i]

        return True