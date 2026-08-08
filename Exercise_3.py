# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I had to check both pattern-to-word and word-to-pattern mappings to keep the relationship one-to-one.
# Approach: I split the string into words and first made sure the word count matches the pattern length.
# Then I tracked the mapping from each pattern character to a word and from each word back to a pattern character.
# If every pair is consistent in both maps, the string follows the pattern.


class Solution:

    def wordPattern(self, pattern, s):
        words = s.split()

        if len(pattern) != len(words):
            return False

        pattern_to_word = {}
        word_to_pattern = {}

        for char, word in zip(pattern, words):
            if char in pattern_to_word and pattern_to_word[char] != word:
                return False

            if word in word_to_pattern and word_to_pattern[word] != char:
                return False

            pattern_to_word[char] = word
            word_to_pattern[word] = char

        return True
