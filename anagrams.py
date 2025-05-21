# Time Complexity: O(n * k log k)
# Space Complexity: O(n * k)

class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        temp_map = {}
        for s in strs:
            sorted_str = "".join(sorted(s))
            if sorted_str in temp_map:
                temp_map[sorted_str].append(s)
            else:
                temp_map[sorted_str] = [s]
        return list(temp_map.values())
