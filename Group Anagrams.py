class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map={}

        for i in range(len(strs)):
            if (''.join(sorted(strs[i]))) not in map:
                map[''.join(sorted(strs[i]))]=[strs[i]]
            else:
                map[''.join(sorted(strs[i]))].append(strs[i])

        return list(map.values())