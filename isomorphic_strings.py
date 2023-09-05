# Time Complexity: O(n) where n is the length of string s or t.
# Space Complexity: O(1) # max 26 chars
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1 =  dict()
        d2 = dict()
        for i in range(len(s)):
            char_s = s[i]
            char_t = t[i]
            if char_s in d1 and d1[char_s] != char_t:
                return False
            else:
                d1[char_s] = char_t
            if char_t in d2 and d2[char_t] != char_s:
                return False
            else:
                d2[char_t] = char_s
        return True

##########################################################################
# HashMap and HashSet
# class Solution:
#     def isIsomorphic(self, s: str, t: str) -> bool:
#         d1 =  dict()
#         set_s = set()
#         for i in range(len(s)):
#             char_s = s[i]
#             char_t = t[i]
#             if char_s in d1:
#                 if d1[char_s] != char_t:
#                     return False
#             else:
#                 d1[char_s] = char_t
#                 if char_t in set_s:
#                     return False
#                 set_s.add(char_t)
#         return True
