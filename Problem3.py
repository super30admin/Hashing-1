# // Time Complexity : O(N) where N is the length of the pattern or the number of words in s
# // Space Complexity : O(M) where M is the number of unique characters in pattern and unique words in s
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach
# The approach is to use two hashmaps to store character to word mapping and vice versa.
# For each character in the pattern and corresponding word in the string,
# check if mappings are consistent. Similar to isomorphic strings.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        ps = {}
        sp = {}

        if len(pattern) != len(s):
            return False

        for i in range(len(pattern)):
            if (pattern[i] in ps and ps[pattern[i]] != s[i]) or (s[i] in sp and sp[s[i]] != pattern[i]):
                return False
            ps[pattern[i]] = s[i]
            sp[s[i]] = pattern[i]
        return True
