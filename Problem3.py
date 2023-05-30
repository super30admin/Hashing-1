# Time Complexity : O(n) where n in the number strings in s (or) the number of characters in pattern
# Space Complexity : O(n) for the 2 hashmaps
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Same as the isomorphic strings, except here we map from character to string in one hashmap
# and string to character in the other.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        ps = {}
        sp = {}
        s = s.split(' ')
        if len(pattern) != len(s):
            return False

        for i in range(len(pattern)):
            
            if pattern[i] in ps and ps[pattern[i]] != s[i]:
                return False
            ps[pattern[i]] = s[i]

            if s[i] in sp and sp[s[i]] != pattern[i]:
                return False            
            sp[s[i]] = pattern[i]
        
        return True            
