# https://leetcode.com/problems/isomorphic-strings/

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach in three sentences only
# Approach:
# Two strings 's' and 't' are Isomorphic if we are able to retrieve string 't' by replacing every char in string 's' 
# with the respective mapping that exists and viceversa. The mapping needs to be valid both ways. This can be solved by maintaining
# two hashmaps. One hashmap to maintain the mapping from 's' to 't' and another to maintain mapping from 't' to 's'. We will be checking 
# if a mapping already exists for the current character in the the hashmap for 's' and also see if there is a mapping that exists from 't' to 's'.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        smap = {}
        tmap = {}
        i, j = 0, 0

        for i, j in zip(s, t):
            if i not in smap and j not in tmap:
                smap[i] = j
                tmap[j] = i
            elif (i not in smap and tmap[j]) or (j not in tmap and smap[i]):
                return False
            elif (i in smap or j in tmap) and (smap[i] != j or tmap[j] != i):
                return False
        return True