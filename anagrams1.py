from typing import List
from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = defaultdict(list)

        for word in strs:
            # Sort the word to use it as a key for grouping
            sorted_word = ''.join(sorted(word))
            anagrams[sorted_word].append(word)

        return list(anagrams.values())