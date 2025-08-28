## Problem 3:

# 290. Word Pattern
# https://leetcode.com/problems/word-pattern/description/

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

# Time Complexity : O(len(s))
# Space Complexity : O(len(s))
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Here we check one-to-one mapping of pattern letter to a word and then similarly we check one-to-one mapping of a word to pattern letter
# Because we need to check if pattern letter has already been mapped to word or a word has already been mapped to a letter
# we need data structure that provides O(1) search. Hence we use 2 hashmaps one for each mapping

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        # its like we need to verify uniqueness of pattern to word
        # and uniqueness of word to pattern
        wordList = s.split() #O(len(s))
        if(len(pattern) != len(wordList)):
            return False

        pMap = {}
        sMap = {}

        for i in range(len(pattern)):#O(len(pattern))
            # verify uniqueness of pattern to word
            if(pattern[i] in pMap):
                if(pMap[pattern[i]] != wordList[i]):
                    #uniqueness of pattern to word failed
                    return False
            else:
                pMap[pattern[i]] = wordList[i]

            # verify uniqueness of word to pattern
            if(wordList[i] in sMap):#O(K) -- going through chars of wordList[i] to get the hashfunction value. Lets say k is avearge length of the word
                if(sMap[wordList[i]] != pattern[i]):
                    #uniqueness of word to pattern failed
                    return False

            else:
                sMap[wordList[i]] = pattern[i]

        return True

sol = Solution()
print(sol.wordPattern("abba", "dog cat cat dog"))
print(sol.wordPattern("abba", "dog cat cat fish"))
print(sol.wordPattern("aaaa", "dog cat cat dog"))
print(sol.wordPattern("a", "dog cat cat fish"))
print(sol.wordPattern("abba", "dog cat"))
print(sol.wordPattern("abbc", "dog cat cat fish"))
print(sol.wordPattern("abbc", "dog cat cat dog"))