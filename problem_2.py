class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dictu = {}
        for i in range(len(s)):
            if s[i] not in dictu and t[i] not in dictu.values():
                dictu[s[i]] = t[i]
            elif s[i] not in dictu or dictu[s[i]] != t[i]:
                return False
        return True


check = Solution()
print(check.isIsomorphic('add', 'foo'))

