# ## Problem 3:
# Given a pattern and a string str, find if str follows the same pattern.
# Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# Example 1:
# Input: pattern = "abba", str = "dog cat cat dog"
# Output: true

# Example 2:
# Input:pattern = "abba", str = "dog cat cat fish"
# Output: false

# Example 3:
# Input: pattern = "aaaa", str = "dog cat cat dog"
# Output: false

# Example 4:
# Input: pattern = "abba", str = "dog dog dog dog"
# Output: false
# Notes:
# You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

# Time Complexity: O(n)
# Space complexity: O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        my_dict = {}
        my_list = s.split(" ")
        my_set = []
        if (len(pattern) != len(my_list)):
            return False
        for i in range (0,len(pattern)):
            schar = pattern[i]
            tchar = my_list[i]
            if (schar in my_dict):
                if(my_dict[schar]!= tchar):
                    return False
            else:
                if (tchar in my_set):
                    return False
                else:
                    my_dict[schar] = tchar
                    my_set.append(tchar)
        return True