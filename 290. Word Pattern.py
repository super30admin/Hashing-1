# Time Complexity O(n). No of words in s.
# Space Complexity O(n). No of unique words in s.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        char_map = {}
        word_map = {}

        if len(words) != len(pattern):
            return False

        for c, w in zip(pattern, words):
            if c not in char_map:
                if w in word_map:
                    return False
                else:
                    char_map[c] = w
                    word_map[w] = c
            else:
                if char_map[c] != w:
                    return False
        return True