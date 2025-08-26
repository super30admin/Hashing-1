def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        map=defaultdict(list)

        for str in strs: #time complexity : O(k logk) space complexity: O(n)
            key=" ".join(sorted(str))
            map[key].append(str)

            if key not in map:
                map[key]=[]

        return list(map.values())