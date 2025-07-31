# We split the input string into words and check if the number of words matches the pattern length.
# Using two hash maps, we track pattern → word and word → pattern mappings to ensure a one-to-one correspondence.
# If any mapping conflict occurs, we return False; otherwise, the pattern is correctly followed.

class Solution(object):
    def wordPattern(self, pattern, str):
        words = str.split()
        if len(words) != len(pattern):
            return False

        char_to_word = {}
        word_to_char = {}

        for c, w in zip(pattern, words):
            if (c in char_to_word and char_to_word[c] != w) or \
               (w in word_to_char and word_to_char[w] != c):
                return False
            char_to_word[c] = w
            word_to_char[w] = c

        return True
