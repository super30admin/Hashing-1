# Time Complexity : O(n)
# Space Complexity : O(1) : no extra space used
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
"""1. We split the input string into words and create a mapping from words to pattern characters.
2. We check if the lengths of the pattern and words are the same, and if the sets of characters are the same.
3. We iterate through the words and check if the mapping is consistent; if not, we return False."""
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        words, mapPatterns = s.split(' '), dict()
        # If the lengths of the pattern and words are not the same, return False
        if len(pattern) != len(words): return False
        # If the set of characters in the pattern is not the same as the set of words, return False
        if len(set(pattern)) != len(set(words)): return False 

        # Iterate through the words and check the mapping
        # If a word is not in the map, add it with the corresponding pattern character
        for i in range(len(words)):
            # If the word is not in the map, add it with the corresponding pattern character
            if words[i] not in mapPatterns: 
                mapPatterns[words[i]] = pattern[i]
            # If the word is in the map, check if it matches the corresponding pattern character
            elif mapPatterns[words[i]] != pattern[i]: 
                return False
        # If all mappings are consistent, return True
        return True