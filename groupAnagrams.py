# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No



# In this approach, anagrams are mapped according to their sorted keys using a dictionary 
# when the key doesn't exist in the dictionary, we create it as well as an empty list associated with it if the key doesn't exist
# Words are added to their respective sorted keys. As a result, the values are returned as a list of strings

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        word_map = dict()
        for st in strs:
            sorted_s = (''.join(sorted(st)))
            if sorted_s not in word_map:
                word_map[sorted_s] = list()
            word_map[sorted_s].append(st)
        return word_map.values()
