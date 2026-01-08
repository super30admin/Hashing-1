"""
time - o(n)
space - o(n)
we take each word, sort its letters and store it as the key, and the word becomes
a value in dictionary
"""

from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = {}
        for string in strs:
            string_tuple = tuple(sorted(list(string)))
            if not string_tuple in anagram_map:
                anagram_map[string_tuple] = []
            anagram_map[string_tuple].append(string)
        result = []
        for _, value in anagram_map.items():
            result.append(value)
        return result
