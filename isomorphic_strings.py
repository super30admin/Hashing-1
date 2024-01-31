"""Using two hashmaps: Iterate over tho input strings and place 1:1 mappings between
these two strings in their corresponding hashmaps if not seen previously. If in case
the character is seen before, we check if the pairing character is same. If not same
then return False
Time Complexity: O(n)+O(n)=O(n)
Space: O(1) constant space because hashmap size does not increase with input size"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False

        s_t, t_s = {}, {}

        for s_char, t_char in zip(s, t):
            if s_char not in s_t and t_char not in t_s:
                s_t[s_char] = t_char
                t_s[t_char] = s_char
            elif s_char in s_t:
                if not s_t[s_char] == t_char:
                    return False
            elif t_char in t_s:
                if not t_s[t_char] == s_char:
                    return False
        return True