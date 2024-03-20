# https://leetcode.com/problems/group-anagrams/

# Time Complexity : O(log(L) * N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach in three sentences only
# Approach : We sort each string and check if it is already present in the dict.
# If it is present then add to the common anagram group. Otherwise, add the anagram to dict and create a new list with
# it.


from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = {}
        for i in strs:
            key = ''.join(sorted(i))
            if key not in result:
                result[key] = []
            result[key].append(i)
        return list(result.values())
