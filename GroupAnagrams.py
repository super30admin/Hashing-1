#Time Complexity : O(mnlogn) where m is number of strings in given array and n is length of longest string in array
#Space Complexity : O(mn) where m is number of strings in given array and n is length of longest string in array
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = collections.defaultdict(list)

        for word in strs:
            sword = "".join(sorted(word))
            anagrams[sword].append(word)

        return anagrams.values()
