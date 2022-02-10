# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict1 = {}
        s = s.split()
        if len(pattern) != len(s) or (len(set(pattern)) != len(set(s))):
            return False
        for i in range(len(pattern)):
            value = dict1.get(pattern[i])
            print(value)
            if value is not None:
                if s[i] != value:
                    return False
            else:
                dict1[pattern[i]] = s[i]
        return True