"""Using two hashmaps

Time complexity will be O(n) + O(n) = O(n)
Space complexity will be O(1)"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(pattern) != len(words):
            return False

        pattern_words_map, words_pattern_map = {}, {}

        for p, word in zip(pattern, words):
            if p not in pattern_words_map and word not in words_pattern_map:
                pattern_words_map[p] = word
                words_pattern_map[word] = p
            elif p in pattern_words_map:
                if not pattern_words_map[p] == word:
                    return False
            elif word in words_pattern_map:
                if not words_pattern_map[word] == p:
                    return False
        return True