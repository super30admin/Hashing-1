# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach in three sentences only
# We are using a dictionary in this approach to map anagrams with respect to their sorted key
# the key will always be a sorted string, if the key does not exists in the dictionary then we create the key and also an empty list associated to the key
# and the words are added to the list of their respective sorted keys. In the end, the values which is the list of strings are returned as an output as required


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        word_map = dict()
        for s in strs:
            sorted_s = (''.join(sorted(s)))
            if sorted_s not in word_map:
                word_map[sorted_s] = list()
            word_map[sorted_s].append(s)
        return word_map.values()