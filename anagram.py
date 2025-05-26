# Time Complexity: O(n * k log k)
# n = number of words in the list
# k = maximum lenght of the word
# Space Complexity : O(n * k)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


# Your code here along with comments explaining your approach
# Anagrams has same characters in any order. So here if we take a dictinory and iterate through each word in the lost
# Sort the characters in each word and store it in the dict. If the same pattern of sorted characters appear append to the same list

from typing import List
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = dict()
        for i in strs:
            sorted_str = "".join(sorted(i))
            if sorted_str not in anagram_dict:
                anagram_dict[sorted_str] = []
            anagram_dict[sorted_str].append(i)
        return list(anagram_dict.values())