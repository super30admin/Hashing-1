"""
Given an array of strings, group anagrams together.
Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
Note: All inputs will be in lowercase. The order of your output does not matter.

TC: 0(N)
SC: O(N)
Running on LC: Yes
Approach:
1. For each string, create a array of range(0,26)
2. At index ord(char) - ord('a), value = freq
3. Store this in a dictionary -> key = tuple of above arr, val = list of anagrams
"""
from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs):
        bucketToAnagram = defaultdict(lambda: [])
        for s in strs:
            charIndexFreq = [0 for x in range(0, 26)]
            for ch in s:
                 charIndexFreq[ord(ch) - ord('a')] += 1
            bucketToAnagram[tuple(charIndexFreq)].append(s)
        res = []
        for values in bucketToAnagram.values():
            res.append(values)
        return res    

