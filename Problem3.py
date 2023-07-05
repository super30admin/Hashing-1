class Solution:
    # Time Complexity: O(N)
    # Space Complexity: O(N)
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(pattern) != len(words):
            return False

        map_pattern = {}
        map_words = {}

        for p, w in zip(pattern, words):
            if (p not in map_pattern) and (w not in map_words):
                map_pattern[p] = w
                map_words[w] = p
            elif map_pattern.get(p) != w or map_words.get(w) != p:
                return False
        return True
