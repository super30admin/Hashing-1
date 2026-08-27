#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        prim = {}
        second = set()
        for i in range(len(s)):
            char_s = s[i]
            char_t = t[i]

            if char_s in prim:
                if prim[char_s] != char_t:
                    return False
            else:
                if char_t in second:
                    return False
                prim[char_s] = char_t
                second.add(char_t)
        return True
