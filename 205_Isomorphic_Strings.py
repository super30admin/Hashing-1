# Time Complexity : O(N)
# Space Complexity : O(1) as s1 and s2 can have a max of 26 unique values
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        #1 hashmap 1 hashset solution
        s1 = dict()
        s2 = set()

        # both strings need to be of same length for one-one mapping
        if len(s) != len(t):
            return False

        # here we iterate over the strings and store the s->t mapping in the s1 Hashmap
        # and the mapped values of t in s2 Hashset
        # if the char of t exists in s2, we check if the corresponding character from s is present
        # in s1 and whether it maps the corresponding char in t

        # if the t-char is not present in s2 then it's corresponding s-char should also be not
        # present in s1

        for i in range(len(s)):
            if t[i] in s2:
                if (s[i] not in s1) or (s1[s[i]] != t[i]):
                    return False
            else:
                if s[i] in s1:
                    return False
                s1[s[i]] = t[i]
                s2.add(t[i])
        return True

        # or

        # for i in range(len(s)):
        #     if t[i] in s2:
        #         if s[i] in s1 and s1[s[i]] == t[i]:
        #             continue
        #         else:
        #             return False
        #     else:
        #         if s[i] in s1:
        #             return False
        #         s1[s[i]] = t[i]
        #         s2.add(t[i])
        # return True


        #2HashMap Solution
#         s1 = dict()
#         s2 = dict()

#         if len(s) != len(t):
#             return False

#         for i in range(len(s)):
#             if s[i] in s1:
#                 if s1[s[i]] == t[i] and s2[t[i]] == s[i]:
#                     continue
#                 else:
#                     return False
#             else:
#                 if t[i] in s2 and (s2[t[i]] != s[i]):
#                     return False
#                 s1[s[i]] = t[i]
#                 s2[t[i]] = s[i]
#         return True