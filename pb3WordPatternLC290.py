"""
    Approach - each character in pattern maps to a word in s and viceversa
    we will have 2 hashMaps
        c_word_map = {} # char -> string
        word_c_map = {} # string -> char
    if key to value mapping holds true for both hashMap c > string and string -> char
    We will be using hashMap as read and writes happen in O(1)
    but we need to iterate through each character in string and also words in list
      so TimeComplexity O(m+n) where m and n are length of pattern and words in string.

"""


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        c_word_map = {}
        word_c_map = {}
        word_list = s.split(" ")
        if len(pattern) != len(word_list):
            return False
        for i in range(len(pattern)):
            # check if key exists in hashMap and return value match for both hashMap if one of them fails return False
            if (
                pattern[i] in c_word_map and c_word_map.get(pattern[i]) != word_list[i]
            ) or (
                word_list[i] in word_c_map
                and word_c_map.get(word_list[i]) != pattern[i]
            ):
                return False
            c_word_map[pattern[i]] = word_list[i]
            word_c_map[word_list[i]] = pattern[i]
        return True
