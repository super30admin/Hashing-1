# // Time Complexity : O(n) 
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# Compute a hash for every string as follows:
#     - Initialize an array of size 26 with 0s
#     - Add 1 for every character in the string
#     - Use this as a hash for the string, anagrams will map to the same hash

from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        def computeArray(s):
            array = [0]*26
            for char in s:
                array[ord(char) - ord('a')] += 1
                
            return tuple(array)
        
        s_map = defaultdict(list)
        out = []
        for s in strs:
            arr = computeArray(s)
            s_map[arr].append(s)
        for v in s_map.values():
            out.append(v)
            
        return out
            