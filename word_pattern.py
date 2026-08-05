#Time Complexity : O(n)
# Space Complexity : O(1) since we have only 26 charcters max in hash map we have 26 keys. so space complexity is O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        """
        So in this problem, we are mapping a character with a string.
        pattern = "abba", s = "dog cat cat dog"
        so a -> dog, b -> cat, b -> cat, a -> dog
        so we basically maintain a hash map.
        idea is to iterate over each character in pattern and also parallely map the word in string s.
        we can over the string s to a list, for easy of use. we can split by space. once we do it we can iterate over length of pattern and for each character we map a word in the list. and before adding that char in the( hash map we check if it already exists and if it exists then the value is equivalen tothe word in s.
        similarly we also check if s to pattern mapping is also right. as a base case we check length of pattern and words in string s matches. otherwise we return false.
        """
        word_list = list(s.split(" "))
        if len(pattern) != len(word_list): return False
        result_map = {}
        result_map_word = {}
        for i in range(len(pattern)):
            #patternt o word list mapping check
            if pattern[i] in result_map:
                if result_map[pattern[i]] != word_list[i]:
                    return False
            else:
                result_map[pattern[i]] = word_list[i]
            #word to pattern char mapping check
            if word_list[i] in result_map_word:
                if result_map_word[word_list[i]] != pattern[i]:
                    return False
            else:
                result_map_word[word_list[i]] = pattern[i]
        return True
        