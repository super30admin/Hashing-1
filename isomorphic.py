# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Use a hashmap to store character mappings from string `s` to `t`.
# Iterate through both strings once and validate the one-to-one mapping.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        key_map = {}
        value_set = set()

        for i in range(len(s)):
            if s[i] not in key_map:
                if t[i] in value_set:
                    return False
                key_map[s[i]] = t[i]
                value_set.add(t[i])
            else:
                if key_map[s[i]] != t[i]:
                    return False
        return True
