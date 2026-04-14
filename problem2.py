# // Time Complexity : O(n)
# // Space Complexity : O(n) though max size will be 256 for ASCII characters which is constant space, so can be considered O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : NA

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False

        smap = {}
        tmap = {}

        for char_s, char_t in zip(s, t):
            if char_s in smap:
                if smap[char_s] != char_t:
                    return False
            else:
                smap[char_s] = char_t

            if char_t in tmap:
                if tmap[char_t] != char_s:
                    return False
            else:
                tmap[char_t] = char_s

        return True
        