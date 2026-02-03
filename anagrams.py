'''
Time Complexity : O(nklogk)
Space Complexity : O(nk)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this :  No
'''
class Solution:
    def groupAnagrams(self, strs):
        ans = {}

        for s in strs:
            key = "".join(sorted(s))
            ans[key] = ans.get(key, [])
            ans[key].append(s)

        return list(ans.values())
