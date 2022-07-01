'''
## Problem 290: Word Pattern

## Author: Neha Doiphode
## Date:  06-27-2022

## Description:
    Given a pattern and a string s, find if s follows the same pattern.
    Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.


## Examples:
    Example 1:
        Input: pattern = "abba", s = "dog cat cat dog"
        Output: true

    Example 2:
        Input: pattern = "abba", s = "dog cat cat fish"
        Output: false

    Example 3:
        Input: pattern = "aaaa", s = "dog cat cat dog"
        Output: false

    Example 4:
        Input: pattern = "abc",  s = "b c a"
        Output: true

## Constraints:
    * 1 <= pattern.length <= 300
    * pattern contains only lower-case English letters.
    * 1 <= s.length <= 3000
    * s contains only lowercase English letters and spaces ' '.
    * s does not contain any leading or trailing spaces.
    * All the words in s are separated by a single space.


## Time Complexity:
    If m = length of pattern
       n = number of words
       k = average length of pattern

    1. Splitting of words based on space ~= O(nk)
    2. Go over m characters to create hash map ~= O(m)
    3. Comparision of pattern characters ~= O(mk) -------> Final complexity.

## Space Complexity:
    O(nk) to store words in the input list of words.


'''

def get_input():
    print("Enter the list of words: ", end = "")
    words = input()
    print("Enter the pattern: ", end = "")
    pattern = input()
    return words, pattern

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word_map = {}
        pattern_map = {}
        s = s.split()
        if len(s) != len(pattern):
            return False

        for char, word in zip(pattern, s):
            if char in pattern_map and pattern_map[char] != word:
                return False
            elif char not in pattern_map:
                pattern_map[char] = word
                if word in word_map and word_map[word] != char:
                    return False
                word_map[word] = char

        return True

    def wordPattern_IndexMapping(self, pattern: str, words:str) -> bool:
        index_map = {}

        new_pattern = []
        new_s = []

        words = words.split()

        if len(words) != len(pattern):
            return False

        for index, char in enumerate(pattern):
            if char not in index_map:
                index_map[char] = index
            new_pattern.append(index_map[char])

        index_map.clear()

        for index, word in enumerate(words):
            if word not in index_map:
                index_map[word] = index
            new_s.append(index_map[word])

        if new_pattern != new_s:
            return False
        return True


# Driver code
solution = Solution()
words, pattern = get_input()
result_1 = solution.wordPattern(pattern, words)
result_2 = solution.wordPattern_IndexMapping(pattern, words)
print(f"Input string: {words}")
print(f"Input pattern: {pattern}")
print(f"Approach 1: Using hash map:      Result: {result_1}")
print(f"Approach 2: Using index mapping: Result: {result_2}")
