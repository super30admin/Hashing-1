"""
TC: O(N mlog m)
SC: O(N)
"""

from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dict_ = defaultdict(list)
        for string in strs:
            sorted_str = str(sorted(string))
            dict_[sorted_str].append(string)
        res = []
        for key, values in dict_.items():
            res.append(values)
        return res
        
            
            
