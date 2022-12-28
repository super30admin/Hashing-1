# Time Complexity O(nlogm) m is the len of each string
# Space Complexity O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash_map = {}

        for each in strs:
            sorted_order = "".join(sorted(list(each)))
            if sorted_order not in hash_map:
                hash_map[sorted_order] = []
            hash_map[sorted_order].append(each)

        return hash_map.values()