class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs) == 0 or strs == None:
            return []
        map = collections.defaultdict(list)

        for x in strs:
            sorted_letters = ''.join(sorted(x))
            map[sorted_letters].append(x)
        return list(map.values())

