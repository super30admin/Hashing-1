#Time Complexity : O(n) where n is the length of input string (as both strings have to be of the same length)
#Space Complexity : O(2n) as we require two DS i.e. HashMap and Set but both datastructures can be of max length 26 as it only contains all unique letters => O(1) 
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        mapping = {}
        seen = set()

        for c1, c2 in zip(s, t):
            if c1 in mapping and mapping[c1] != c2:
                return False
            elif c1 not in mapping and c2 in seen:
                return False
            else:
                mapping[c1] = c2
                seen.add(c2)


        return True
