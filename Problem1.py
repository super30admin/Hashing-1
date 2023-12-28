# // Time Complexity : O(NKlogK) where N is the number of strings and K is the maximum length of a string
# // Space Complexity : O(NK) to store the hashmap where K is the length of the longest string
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach
# The approach is to sort each word and use the sorted word as a key in a hashmap.
# All anagrams will have the same sorted word, and they are grouped together in the hashmap.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hm = {}
        for word in strs:
            sortedWord = "".join(sorted(word))
            if sortedWord in hm:
                hm[sortedWord].append(word)
            else:
                hm[sortedWord] = [word]
        return hm.values()
