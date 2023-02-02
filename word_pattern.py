# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach in three sentences only
# Initally we are checking for base condition to see if length of pattern and word count matches
# Here the approach is same as isomorphic strings where dictionary is utilized for mapping the keys with its corresponding word and once it is added as a value to
# the key, the word is added to the set to check if it does not repeat for any other character key in the dictionary. If it does then it returns false, else it returns true



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