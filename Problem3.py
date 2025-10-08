def wordPattern(self, pattern, s):
        """
        Very similar to isomorphic strings. Maintain two hashmaps - one which maps character to word and another which maps word to character
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        charToWord = {}
        wordToChar = {}
        words = s.split(" ")
        if len(pattern) != len(words):
            return False
        for char, word in zip(pattern, words):
            if(char in charToWord and charToWord[char]!=word) or (word in wordToChar and wordToChar[word]!=char):
                return False
            charToWord[char] = word
            wordToChar[word] = char
        return True

        