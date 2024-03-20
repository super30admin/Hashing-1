# https://leetcode.com/problems/word-pattern/description/

# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach in three sentences only
# Approach : We map the character to word and word to character. If there is a conflict then we return False.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        char_dictionary, word_dictionary = {}, {}
        words = s.split(" ")
        if len(words) != len(pattern):
            return False

        for char, word in zip(pattern, words):
            if char not in char_dictionary:
                char_dictionary[char] = word
            if word not in word_dictionary:
                word_dictionary[word] = char

            if char_dictionary[char] != word or word_dictionary[word] != char:
                return False
        return True

# Given a pattern and a string s, find if s follows the same pattern. pattern and s are same if:
#
# each character in pattern represents a word in s
# No two distinct characters in pattern can represent the same word in s
# No single character in pattern can represent two distinct words in s.
# e.g.:
#
# pattern = 'abab'; s = 'dog cat dog cat'; return True
# 'a' represents 'dog' and 'b' represents cat
#
# pattern = 'abcb'; s = 'dog cat dog cat'; return False
# 'a' represents 'dog', 'b' represents 'cat'. Then 'c' cannot represent 'dog' again as 'a' already represents 'dog'
# (#2 condition is: No two distinct characters in pattern i.e. 'a' and 'c' can represent same word i.e 'dog'.)
#
# pattern = 'abcb'; s = 'dog cat hat cat'; return True
# 'a' represents 'dog'; 'b' represents 'cat'; 'c' represents 'hat'; and last 'cat' is already represented by 'b' and
# last character in pattern is also 'b'.
