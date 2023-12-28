# Time Complexity : O(N) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# we are creating 2 hashmaps and then comparing the the pattern to string, the way this is done is by creating 2 hashmaps where we map a char to word and in the other hashmap we map the word to char we comapre the two maps to the respective value and if there is a misalignment we return false otherwise we add the the values to the map
# 290. Word Pattern
# https://leetcode.com/problems/word-pattern/
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        if len(words) != len(pattern):
            return False
        
        char_to_word = {}
        word_to_char = {}

        for x in range(len(pattern)):
            char = pattern[x]
            word = words[x]

            if char in char_to_word and char_to_word[char] != word:
                return False
            elif word in word_to_char and word_to_char[word] != char:
                return False   
            char_to_word[char] = word
            word_to_char[word] = char
            
        return True