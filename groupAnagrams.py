import collections

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        res = collections.defaultdict(list)
        for value in strs:
            res[str(sorted(value))].append(value)
        return res.values()
