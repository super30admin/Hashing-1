'''
Map the char in pattern with the word in the s.
pattern[i]: s[i]

If the mapping of a pattern already exists and a new word arrives as a map of pattern
Return false

Repeat the same with the map if s to pattern
s[i]: pattern[i]

If both mappings are valid return True
Time Complexity: O(n)
Space Complexity: O(n)
'''
class Solution:

    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(' ')
        if len(words) != len(pattern):
            return False

        wordToSMap = {}

        for word, p in zip(s.split(' '), pattern):
            if word in wordToSMap:
                if wordToSMap[word] != p:
                    return False

            else:
                wordToSMap[word] = p

        del wordToSMap
        sToWordMap = {}
        for p, word in zip(pattern, s.split(' ')):
            if p in sToWordMap:
                if sToWordMap[p] != word:
                    return False

            else:
                sToWordMap[p] = word

        return True