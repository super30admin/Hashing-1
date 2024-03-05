# Time Complexity : O(nklogk)
# Space Complexity : O(nk)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import List
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        if not str:
            return []
        
        map = defaultdict(list)
        for s in strs:
            sorted_s = ''.join(sorted(s))
            map[sorted_s].append(s)
        return list(map.values())
    
sc = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
print(sc.groupAnagrams(strs))