# Match each character in pattern to a word in s.
# Use two hash maps to ensure one to one and onto mapping.
# Return False if any inconsistency is found during traversal.

# Time Complexity: O(n) where n = number of words
# Space Complexity: O(n) for storing mappings

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(words) != len(pattern):
            return False

        char_to_word = {}
        word_to_char = {}

        for c, w in zip(pattern, words):
            if c in char_to_word:
                if char_to_word[c] != w:
                    return False
            else:
                if w in word_to_char:
                    return False
                char_to_word[c] = w
                word_to_char[w] = c

        return True
