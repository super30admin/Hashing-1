# ## Problem 3:
# Given a pattern and a string str, find if str follows the same pattern.
# Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# Example 1:
# Input: pattern = "abba", str = "dog cat cat dog"
# Output: true

# Example 2:
# Input:pattern = "abba", str = "dog cat cat fish"
# Output: false

# Example 3:
# Input: pattern = "aaaa", str = "dog cat cat dog"
# Output: false

# Example 4:
# Input: pattern = "abba", str = "dog dog dog dog"
# Output: false
# Notes:
# You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

# // Time Complexity :O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern, s):
        # checking if empty
        if len(pattern) == 0 or len(s) == 0:
            return False
        # creating list of words
        words = s.split()
        # checking if len in not equal
        if len(pattern) != len(words):
            return False
        # hashmap for words to pattern
        word_map = {}
        # hashmap for pattern to words
        pattern_map = {}
        # mapping words to corresponding chars in s
        for i in range(len(words)):
            # add word if not present already
            if words[i] not in word_map:
                word_map[words[i]] = pattern[i]
            # check if matches pattern if present
            elif word_map[words[i]] != pattern[i]:
                return False
        for i in range(len(pattern)):
            # add pattern char if not present already
            if pattern[i] not in pattern_map:
                pattern_map[pattern[i]] = words[i]
            # check if matches pattern if present
            elif pattern_map[pattern[i]] != words[i]:
                return False
        # A match
        return True


sol = Solution()
s = "dog cat cat dog"
pattern = "abba"
print(sol.wordPattern(pattern, s))
