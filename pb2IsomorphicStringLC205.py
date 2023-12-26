"""
    Approach - s is isomorphic with t means t is also isomorphic to s
    so we will have a maping between s to t and similarly t to s.
    We will be using hashMap as read and writes happen in O(1)
    but we need to iterate through each character in string so TimeComplexity O(2 * n) ~= O(n)

"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map_S_T, map_T_S = {}, {}

        for c1, c2 in zip(s, t):
            if (c1 in map_S_T and map_S_T[c1] != c2) or (c2 in map_T_S and map_T_S[c2] != c1):
                return False
            map_S_T[c1] = c2
            map_T_S[c2] = c1

        return True