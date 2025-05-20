"""
Problem 3:
Input: pattern = "abba", s = "dog cat cat dog"

Approach - one-to-one mapping as same as isomorphic strings

Time - O(n)
Space - O(n)

"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(words) != len(pattern):
            return False

        char_to_word = {}
        used_words = set()

        for char, word in zip(pattern, words):
            if char in char_to_word:
                if char_to_word[char] != word:
                    return False
            else:
                if word in used_words:
                    return False
                char_to_word[char] = word
                used_words.add(word)

        return True
