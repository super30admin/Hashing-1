# Time Complexity : O(n) where n is the number of words in str
# Space Complexity : O(m) where m is the number of unique characters in pattern
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Split the string into words and check if pattern length matches word count.
# Use two dictionaries to maintain bidirectional mapping between pattern characters and words.
# For each pattern character and corresponding word, verify no conflicts exist in either direction.

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        words = str.split()
        
        # Check if pattern length matches number of words
        if len(pattern) != len(words):
            return False
        
        pattern_to_word = {}
        word_to_pattern = {}
        
        for i in range(len(pattern)):
            char = pattern[i]
            word = words[i]
            
            # Check if pattern->word mapping exists and conflicts
            if char in pattern_to_word:
                if pattern_to_word[char] != word:
                    return False
            else:
                pattern_to_word[char] = word
            
            # Check if word->pattern mapping exists and conflicts
            if word in word_to_pattern:
                if word_to_pattern[word] != char:
                    return False
            else:
                word_to_pattern[word] = char
        
        return True

