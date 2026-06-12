# Leetcode https://leetcode.com/problems/word-pattern/
# Time Complexity O(n)
# Space Complexity O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        n = len(words)
        k = len(pattern)
        if n != k:
            return False
        sMap = {}
        tMap = {}
        for i in range(0, n):
            letter = pattern[i]
            word = words[i]
            if letter in sMap:
                if sMap[letter] != word:
                    return False
            else:
                sMap[letter] = word
            if word in tMap:
                if tMap[word] != letter:
                    return False
            else:
                tMap[word] = letter
        return True
