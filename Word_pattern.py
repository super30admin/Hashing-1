# Time Complexity : O(N) - len of pattern and string O(M+N).
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 


# Your code here along with comments explaining your approach
# turn  string of words into a list of separate words to compare them to the pattern letters.
# check if number of letters in the pattern and the number of words are the same; if not return False.
# Using dictionary and a set to match each letter in the pattern to exactly one unique word.

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        
        mapping = dict()
        assigned_value = set()
        words = s.split()

        if len(pattern) != len(words):
            return False

        for i in range(len(pattern)):
            char_p = pattern[i]
            word_s = words[i]

            if char_p in mapping:
                if mapping[char_p] != word_s:
                    return False
            else:
                if word_s in assigned_value:
                    return False
                #new value map it
                mapping[char_p] = word_s
                assigned_value.add(word_s)

        return True