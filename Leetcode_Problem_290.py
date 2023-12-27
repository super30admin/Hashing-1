# Problem name: Word Pattern
# Problem URL: https://leetcode.com/problems/word-pattern/
#time complexity: O(n)
#space complexity: O(1)
#approach: we create two dictionaries and map the characters of the two strings to each other. if the character is already mapped to another character, we return False. if not, we map the characters to each other.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()

        if len(pattern) != len(words):
            return False

        char_to_word = {}
        word_to_char = {}

        for char, word in zip(pattern, words):
            if char in char_to_word:
                if char_to_word[char] != word:
                    return False
            else:
                char_to_word[char] = word

            if word in word_to_char:
                if word_to_char[word] != char:
                    return False
            else:
                word_to_char[word] = char

        return True
