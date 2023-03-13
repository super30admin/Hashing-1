# Time Complexity : O(N)
# Space Complexity : O(N)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()  # split the input string into words
        if len(pattern) != len(words):  # check if the pattern and word length match
            return False
        
        pattern_to_word = {}  # create an empty dictionary to map pattern to word
        word_to_pattern = {}  # create an empty dictionary to map word to pattern
        
        for i in range(len(pattern)):
            if pattern[i] in pattern_to_word:  # check if pattern[i] has already been mapped
                if pattern_to_word[pattern[i]] != words[i]:  # check if the mapping is consistent
                    return False
            else:
                if words[i] in word_to_pattern:  # check if words[i] has already been mapped
                    return False
                pattern_to_word[pattern[i]] = words[i]  # map pattern[i] to words[i]
                word_to_pattern[words[i]] = pattern[i]  # map words[i] to pattern[i]
        
        return True