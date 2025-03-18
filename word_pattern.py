'''
Map each char in pattern to word in words and vice versa. Return False, when there is a mismatch in either of the dictionary.
When all loops ends,it returns True.

Time Complexity: O(n)
Space Complexity: O(n)
'''

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
    
        # If pattern and words count mismatch, return False
        if len(pattern) != len(words):
            return False

        char_to_word = {}
        word_to_char = {}

        for char, word in zip(pattern, words):
            if char in char_to_word and char_to_word[char] != word:
                return False
            if word in word_to_char and word_to_char[word] != char:
                return False

            char_to_word[char] = word
            word_to_char[word] = char

        return True