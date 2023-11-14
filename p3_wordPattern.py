# split string to list of words using split and check the len og list to len of pattern; return false if it doesn't match
# map char in pattern as key to words in the list
# do the same where word in list as key to char in the pattern


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        wordList = s.split()          

        if len(pattern) != len(wordList):
            return False

        patternChar,listMap = {},{}

        for char, word in zip(pattern, wordList):

            if char in patternChar:
                if patternChar[char] != word:
                    return False
            else:
                patternChar[char] = word

            
            if word in listMap:
                if listMap[word] != char:
                    return False
            else:
                listMap[word] = char

        return True

# ------------------------------------------------------------------------------------------------------------------------------
# Time complexity: O(N) where N is the length of pattern/words in s