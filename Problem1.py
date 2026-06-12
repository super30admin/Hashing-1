# Leetcode https://leetcode.com/problems/group-anagrams/
# Time Complexity O(N * K log K)
# Space Complexity
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        for str in strs:
            sorted_str = "".join(sorted(str))
            if sorted_str not in map:
                map[sorted_str] = []
            map[sorted_str].append(str)
        return list(map.values())
