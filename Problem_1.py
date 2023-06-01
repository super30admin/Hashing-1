"""
Problem : 1

Time Complexity : O(n)
Space Complexity : O(n)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

creating a 26 length array, using a type of hashing and hashing the character to the array
this way anagrams would be mapped to a single key in the dictionary
"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram=defaultdict(list)

        for s in strs:
            count=[0]*26

            for c in s:
                count[ord(c)-ord('a')]+=1
            anagram[tuple(count)].append(s)
        return anagram.values()