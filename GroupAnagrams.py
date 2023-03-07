# Time complexity: O(NKlogK)
# Space complexity: O(N)

class Solution(object):
    def groupAnagrams(self, strs):
        d = collections.defaultdict(list)
        for w in strs:
            d[''.join(sorted(w))].append(w)
        return d.values()