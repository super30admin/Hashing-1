'''
Iterate over the words and patterns and check for consistent mapping both way.
i.e pattern -> word and word -> pattern
Time complexity: O(N), N = length of words/length of pattern | Iterating over the words/pattern
Space complexity: O(N), word2pattern map and pattern2word map
'''
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ") # collect the words
        
        # length of pattern should match length of words
        if len(pattern)!=len(words):
            return False
        
        pattern2word = {} # mapping of characters in pattern to words
        word2pattern = {} # mapping of words to characters in pattern

        for idx, ch in enumerate(pattern):
            # ch -> word mapping check
            if ch not in pattern2word:
                if words[idx] in word2pattern: # if this word has already been used to map other key
                    return False
                else:
                    pattern2word[ch] = words[idx] # update pattern2word dict
                    word2pattern[words[idx]] = ch # update word2pattern dict
            else:
                mapped_word = pattern2word[ch] 
                if words[idx]!=mapped_word: # inconsistent mapping
                    return False

        return True