class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map_c = {}
        map_w = {}

        words = s.split(' ')
        if len(words) != len(pattern):
            return False

        for c, w in zip(pattern, words):
            if c not in map_c:
                if w in map_w:
                    return False
                else:
                    map_c[c] = w
                    map_w[w] = c
            else:
                if map_c[c] != w:
                    return False
        return True
