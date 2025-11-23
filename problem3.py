"""
We create two maps, one where we store the characters and one we store words, then each of them are travered, if the conditions mentioned (if its mapped with each other only and are present)
return true if so and false otherwise, this is a two pass function so TC is O(N) and SC is also o(N)"""
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        words = s.split(" ")
        if len(pattern) != len(words):
            return False
        wordtoChar = {}
        chartoWord = {}

        for c, w in zip(pattern, words):
            if ((c in chartoWord and chartoWord[c] != w)
                or (w in wordtoChar and wordtoChar[w] != c)):
                return False
            else:
                chartoWord[c] = w
                wordtoChar[w] = c
        return True
