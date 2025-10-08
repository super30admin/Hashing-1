"""
Approach:
You split the string s into words and compare it positionally with the characters in pattern.
A dictionary maps each character to a word, while a set ensures unique mapping targets.
If a mismatch or duplicate association occurs, you return False; otherwise, the pattern holds.

Time Complexity: O(n) — you traverse each character–word pair once.
Space Complexity: O(n) — for storing the hash map and the set of used words.
"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.strip().split()
        if len(pattern) != len(words):
            return False

        h = {}
        used = set()

        for ch, word in zip(pattern, words):
            if ch in h:
                if h[ch] != word:
                    return False
            else:
                if word in used:
                    return False
                h[ch] = word
                used.add(word)
        return True
