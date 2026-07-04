class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()

        if len(pattern) != len(words):
            return False

        mp = {}
        used_words = set()

        for c, w in zip(pattern, words):

            if c in mp:
                if mp[c] != w:
                    return False
            else:
                if w in used_words:
                    return False
                mp[c] = w
                used_words.add(w)

        return True

    # TC - O(n)
    # SC - O(1)

