# Time Complexity: O(n) + O(nk) where n is the number of characters in string s and k is the avg number of characters in word string. We need to split it.  
# Space Complexity: O(1) # 26 characters in char _to_word map
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        # Using 2 hash maps

        # char_word_map =  dict()
        # word_to_char_map = dict()
        # word_list= s.split()
        # if len(pattern) != len(word_list):
        #     return False
        # for i in range(len(pattern)):
        #     pat = pattern[i]
        #     word = word_list[i]
        #     if  pat not in char_word_map:
        #         char_word_map[pat] = word
        #     if word not in word_to_char_map:
        #         word_to_char_map[word] = pat
        #     if word_to_char_map[word] != pat or char_word_map[pat] != word:
        #         return False
        # return True

        # using hashmap and hashset

        char_word_map =  dict()
        word_set = set()
        word_list= s.split()
        if len(pattern) != len(word_list):
            return False
        for i in range(len(pattern)):
            pat = pattern[i]
            word = word_list[i]
            if  pat not in char_word_map:
                if word in word_set:
                    return False
                char_word_map[pat] = word
                word_set.add(word)
            else:
                if char_word_map[pat] != word:
                    return False
        return True
