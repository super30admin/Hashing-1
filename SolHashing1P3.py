"""
Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter 
in pattern and a non-empty word in str.
Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true
Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false
Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false Notes: You may assume pattern contains only lowercase letters, and str contains 
lowercase letters that may be separated by a single space.

TC: O(N)
SC: O(N)
Running on LC: yes
Approach:
1. Split the string onto " " and store into list
2. Use hashmap to store the key = pattern chars and val = item in list
3. Use hash set to store seen values from the list
"""


from collections import defaultdict

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        l = s.split()
        if len(l) != len(pattern):
            return False
        charToStr = defaultdict(lambda: "")
        seen = set()
        for i in range(0, len(l)):
            if pattern[i] in charToStr:
                if charToStr[pattern[i]] != l[i]:
                    return False
            else:
                if l[i] in seen:
                    return False
                charToStr[pattern[i]] = l[i]
                seen.add(l[i])
        return True