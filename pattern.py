# Time Complexity: O(n + k) n: length of s and k: length of the pattern
# Space Complexity : O(k)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


# Your code here along with comments explaining your approach
# No two characters in the pattern should map to same word in a given strings
# No two words in guven strings should map to the same character in the pattern
# So two hashmaps one to check character to word mapping and other from word to char mapping

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split() # Spliting the strings into words and compare each character in pattern with word
        if len(pattern) != len(words):
            return False
        char_word = {}
        word_char = {}
        for p, w in zip(pattern, words):
            if p in char_word:
                if char_word[p] != w:
                    return False
            else:
                char_word[p] = w
            
            if w in word_char:
                if word_char[w] != p:
                    return False
            else:
                word_char[w] = p

        return True