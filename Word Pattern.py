#Problem 3
#Using HashMaps.
#T: O(n)
# Scans all m characters of s once to find spaces and slice out substrings, taking O(m) time.
# Runs at most min(n, len(words)) times.

#S: O(m) ,the total characters across all extracted words is at most m, so words takes O(m) space.
# Even if pattern were longer than s, len(pattern) != len(words) returns False right away before allocating the dictionaries, keeping extra space bounded by O(m)


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        charToWord, wordToChar = {}, {}

        words = s.split(' ')
        if len(pattern) != len(words):
            return False

        for c, w in zip(pattern, words):
            if c in charToWord and charToWord[c] != w:
                return False

            if w in wordToChar and wordToChar[w] != c:
                return False

            charToWord[c] = w
            wordToChar[w] = c

        return True