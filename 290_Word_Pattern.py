# Time Complexity : O(N*K) k is average length of a string
# Space Complexity : O(1) as s1 and s2 can have a max of 26 unique values
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s1 = dict()
        s_list = s.split()
        s2 = set()

        if len(s_list) != len(pattern):
            return False
        # similar logic as the isomorphic string problem with logic marked as the or in isomorphic problem
        for i in range(len(s_list)):
            if s_list[i] in s2:
                if pattern[i] in s1 and s1[pattern[i]] == s_list[i]:
                    continue
                else:
                    return False
            else:
                if pattern[i] in s1:
                    return False
                s1[pattern[i]] = s_list[i]
                s2.add(s_list[i])
        return True