# Time Complexity : O(nlogn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

# sort each of the words in the input string. if the sorted strign again occurs in the hashmap- then it means it has occured already
# add all such sorted strings into the same value for the key in hashmap
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """

        ana_map={}
        for word in strs:
            sorted_wrd=''.join(sorted(word))
            if sorted_wrd not in ana_map:
                ana_map[sorted_wrd]=[]
            ana_map[sorted_wrd].append(word)
        return list(ana_map.values())