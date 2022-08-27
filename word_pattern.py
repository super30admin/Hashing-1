"""
Given a pattern and a string str, find if str follows the same pattern. 
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Time Complexity: O(n), where n is the length of pattern.
Space Complexity: O(1), since the size of ASCII character set is constant.
"""


def word_pattern(pattern, str):
    str_list = str.split(" ")
    if len(pattern) != len(str_list):
        return False

    hm1, hm2 = {}, {}
    for i in range(len(pattern)):
        c1, c2 = pattern[i], str_list[i]
        if c1 in hm1 and hm1[c1] != c2 or c2 in hm2 and hm2[c2] != c1:
            return False
        hm1[c1] = c2
        hm2[c2] = c1

    return True


pattern = "abba"
str = "dog cat cat dog"
print(word_pattern(pattern, str))

pattern = "abba"
str = "dog cat cat fish"
print(word_pattern(pattern, str))
