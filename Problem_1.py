# Time Complexity: O(nlog(n))
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anagram = collections.defaultdict(list)
        for str in strs:
            i = ''.join(sorted(str))
            anagram[i].append(str)
        return anagram.values()