from typing import List
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = {}
        for word in strs:
            s = ",".join(sorted(word))
            if s in d.keys():
                d[s].append(word)
            else:
                d[s] = []
                d[s].append(word)
        return d.values()