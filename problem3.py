#Time Complexity: O(n) 
#Space Complexity: O(n) 
#Check if the index occurence of each character in the pattern matches with the word occurence of each word in str
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()

        if len(pattern) != len(words):
            return False
        
        pattern_indices = tuple(map(pattern.find, pattern))
        word_indices = tuple(map(words.index, words))
        
        return pattern_indices == word_indices
