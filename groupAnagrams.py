from collections import defaultdict
from typing import List
# Time Complexity : O(m*n) where m is the length of the array list and then n is the length of each string in the array
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Using the count array as the key to the hashmap.
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)

        for s in strs:
            count = [0] * 26

            for c in s:
                count[ord(c) - ord('a')] += 1

            res[tuple(count)].append(s)

        return list(res.values())