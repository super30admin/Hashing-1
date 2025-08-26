# Time Complexity : O(NKlogK) where N in the length of the array and K is the maximum length of a string
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am using a hashmap to store the anagrams. The key will be the sorted string and the value will be a list of strings
# that are anagrams of each other. I will iterate through the list of strings, sort each string and use it as a key
# to group the anagrams together.

from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}
        for i in range(len(strs)):
            j = "".join(sorted(strs[i]))
            if j not in hashmap:
                hashmap[j] = []
            hashmap[j].append(strs[i])
        return list(hashmap.values())