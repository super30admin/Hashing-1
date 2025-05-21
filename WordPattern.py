'''
Maintain two dicts for mappings word->patter and pattern->word
Before insertion check if incoming word for string exists and maps to a different character from pattern p
Check for both and return false
If we reach end of loop we return false
'''

class WordPattern:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        if len(words) != len(pattern):
            return False
        
        charToWord, wordToChar = {}, {}

        for w, c in zip(words, pattern):
            if w in wordToChar and wordToChar[w] != c:
                return False
            if c in charToWord and charToWord[c] != w:
                return False
            charToWord[c] = w
            wordToChar[w] = c

        return True



