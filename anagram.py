# // Time Complexity : O(N) N= number of strings in the strs array
# // Space Complexity : O(N) Hash can grow to N in worst case.
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach
# 1) Earch word is sorted and converted back into a string, then used as key to be mapped to, all the values ahead will be appended in the list value.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # sum_letters=0
        grouping={}
        for i in strs:
            hash="".join(sorted(i))
            grouping[hash]=grouping.get(hash,[])+[i]
        return grouping.values()
