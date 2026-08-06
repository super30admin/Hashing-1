#Time Complexity: O(n)
#Space Complexity: O(n)
#Did you complete this code successfully? Yes

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        words = s.split()
        if len(pattern) != len(words):
            return False

        patternToWords = {}
        wordsToPattern = set()

        for i in range(len(words)):
            patternChar = pattern[i]
            word = words[i]
            if patternChar in patternToWords:
                if patternToWords[patternChar] != word:
                    return False
            else:
                if word in wordsToPattern:
                    return False
                patternToWords[patternChar] = word
                wordsToPattern.add(word)

        return True
        