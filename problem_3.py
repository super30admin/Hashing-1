class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        dictu = {}
        if len(pattern) != len(s):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in dictu and s[i] not in dictu.values():
                dictu[pattern[i]] = s[i]
            if pattern[i] not in dictu.keys() or dictu[pattern[i]] != s[i]:
                return False
        return True


check = Solution()
print(check.wordPattern('abba', 'dog cat cat dog'))

