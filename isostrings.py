# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

# get two hashmaps. in one hashamap - add the mapping values and do the same mapping from other character to backwards in the other hashmap
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if(len(s)!=len(t)):
            return False
        iso_map={}
        iso2_map={}
        for char1, char2 in zip(s,t):
            if ((char1 in iso_map and iso_map[char1] != char2) or (char2 in iso2_map and iso2_map[char2]!=char1)):
                return False
            iso_map[char1]=char2
            iso2_map[char2] = char1
        return True