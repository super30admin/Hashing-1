"""
The Key is here to check if the characters in string s can be replaced by string t. that is 
in egg and add e can be replaced by a and g can be replaced by d. Which means strings are isomorphic. For egga addg -- e can be replaced by a, g can be replaced by d, and a can be replaced by g. It is isomorphic. If I take foo and bar, it is not isomorphic
"""
class Solution:

    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping_s_t, mapping_t_s = {}, {}
        if len(s)!= len(t):
            return False
        for c1, c2 in zip(s,t):
            if c1 not in mapping_s_t and c2 not in mapping_t_s:
                mapping_s_t[c1] = c2
                mapping_t_s[c2] = c1
            elif c1 in mapping_s_t and mapping_s_t[c1] != c2:
                return False
            elif c2 in mapping_t_s and mapping_t_s[c2] != c1:
                return False
        return True


        