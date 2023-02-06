# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# At first, we are determining the base condition to test if the pattern's length and word count match.
# The method used here is the same as that used with isomorphic strings: a dictionary is used to map the keys to their corresponding words, 
# and after the word has been added as a value to the key, it is added to the set to see if it appears as a value for any other character key in the dictionary. 
# If so, it returns false; otherwise, it returns true.


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word_count = len(s.split(" "))
        if len(pattern) != word_count:
            return False
        dict1 = dict()
        set1 = set()
        word_list = s.split(" ")
        for i in range(len(pattern)):
            if pattern[i] in dict1:
                if dict1[pattern[i]] != word_list[i]:
                    return False
            elif word_list[i] in set1:
                return False
            else:
                dict1[pattern[i]] = word_list[i]
                set1.add(word_list[i])
        return True
