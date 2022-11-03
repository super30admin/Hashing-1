class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        hm = {}
        for i in range(len(strs)):
            x = ''.join(sorted(strs[i]))
            if x in hm.keys():
                hm[x].append(strs[i])
            else:
                hm[x] = [strs[i]]
        
        return hm.values()