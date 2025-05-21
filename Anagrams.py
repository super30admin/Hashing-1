'''
create array which maintains count of characters and stores in a map
Once mapping is created, we can return the values of the map since anagrams will have same count
'''

class Anagrams:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
            res[tuple(count)].append(s)
        return res.values()
