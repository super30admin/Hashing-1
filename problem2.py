class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d=collections.defaultdict(list)
        for i in strs:
            s=sorted(i)
            ss=''.join(s)
            d[ss].append(i)
        return d.values()
            