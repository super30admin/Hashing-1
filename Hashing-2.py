# ## Problem 2:
# Given two strings s and t, determine if they are isomorphic.
# Two strings are isomorphic if the characters in s can be replaced to get t.
# All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

# Example 1:
# Input: s = "egg", t = "add"
# Output: true

# Note:
# You may assume both s and t have the same length.
# Code explaination: for 2 maps
# 1. The trick here is to not have overlapping with the mappings of the elements. 
# 2. To avoid that, I am using two dictionaries such that they are mapped to each other in first dict and viceversa in the second
# 3. If found a element that has a element mapped but need to be mapped to different one, then that is impossible they are isomorphic strings, hence returing false
# TC : O(n)
# SC : O(1) : max of 26 elements are keys
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
#         sMap = {}
#         sSet = set()
#         for i in range(len(s)):
#             if s[i] not in sMap:
#                 if  t[i] not in sSet:
#                     sMap[s[i]] = t[i]
#                     sSet.add(t[i])
#                     # print(sMap, sSet)
#                 else:
#                     return False
                
#             elif s[i] in sMap:
#                 if sMap[s[i]]==t[i]:
#                     pass
#                 else:
#                     return False
#         return True
        s_t = {}
        t_s = {}
        for c1, c2 in zip(s, t):
            if c1 not in s_t and c2 not in t_s:
                s_t[c1] = c2
                t_s[c2] = c1
            elif s_t.get(c1)!=c2 or t_s.get(c2)!=c1:
                return False
        return True
        # this beats first one 