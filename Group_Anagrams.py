# Time Complexity : O(NK) N:number of strings, K:length of longest string.
# Space complexity :O(NK)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : syntaxes to implement logic.


# Your code here along with comments explaining your approach
# count how many times each letter (a-z) appears and store it in a list of 26 numbers
# turn that list into a tuple (a locked version of a list) so that can be used as a key to dictionary.
from collections import defaultdict

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        res = defaultdict(list)
        for s in strs:
            count =[0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
            res[tuple(count)].append(s)
        return res.values()