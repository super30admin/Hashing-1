# Time Complexity :
# Space Complexity :
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :

# Your code here along with comments explaining your approach
from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        store = {}
        for i in strs:
            sortString = "".join(sorted(i))
            try: store[sortString].append(i)
            except: store[sortString] = [i]

        return store.values()


strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(Solution().groupAnagrams(strs))
