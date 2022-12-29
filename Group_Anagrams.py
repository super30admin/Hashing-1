from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == [""]:
            return [[""]]
        
        res = []
        d = defaultdict(list)
        
        for i in strs:
            s = ''.join(sorted(i))
            d[s].append(i)
        
        for i, j in d.items():
            res.append(j)
            
        return res
