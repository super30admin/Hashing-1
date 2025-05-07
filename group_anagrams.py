"""
Given an array of strings strs, group the anagrams together.
You can return the answer in any order.

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Input: strs = [""]
Output: [[""]]

Time Complexity: O(n), where n is the length of strs.
Space Complexity: O(1), since the size of ASCII character set is constant.
"""

from collections import defaultdict


def group_anagrams(strs):
    result = defaultdict(list)

    for s in strs:
        count = [0] * 26

        for char in s:
            count[ord(char) - ord('a')] += 1

        result[tuple(count)].append(s)

    return result.values()


strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(group_anagrams(strs))
