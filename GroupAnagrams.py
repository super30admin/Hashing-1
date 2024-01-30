'''
TC: O(nk) where n is the number of words and k is the average length of words
SC: O(n) where n is the number of dictionary keys
'''
import collections
from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mydict = collections.defaultdict(list)
        for word in strs:
            ml = [0]*26
            for letter in word:
                ml[(ord(letter)-ord('a'))] += 1
            mydict[tuple(ml)].append(word)
        return mydict.values()

s = Solution()
print(s.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(s.groupAnagrams([""]))