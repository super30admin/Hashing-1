# Time Complexity : O(nk) where n is the number of strings, and k is the average length of a string
# Space Complexity : O(nk) for the hash map
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Here we create a frequency array that is converted to a tuple for use in a dictionary.
# The tuple will be the same for all anagrams of a given string.


from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = defaultdict(lambda: [])
        for s in strs:
            groups[self.getCode(s)].append(s)
        res = []
        for groupVals in groups.values():
            res.append(groupVals)
        return res
    
    def getCode(self, str):
        code = [0] * 26
        for ch in str:
            code[ord(ch)-97] += 1
        return tuple(code)