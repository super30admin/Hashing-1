# Time Complexity : O(n*m)
# Space Complexity : O(n*m)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = dict()
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            if (tuple(count)) not in result.keys():
                result[tuple(count)].append(s)
        return result.values()
        