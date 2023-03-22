# Time Complexity : O(n) as we are iterating through the string
# Space Complexity : O(n) as we are using a hashmap
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""In this code, one hashmap is used to store the one-to-one connection between the pattern 
and the string and another is used to store the one-to-one connection between the string and 
the pattern (this is to maintain the one-to-one connection in both direction). The function then 
returns the boolean value of the equality of the list of the values of the hashmap1 and the 
string and the equality of the string of the values of the hashmap2 and the pattern."""

import collections

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(' ')

        if len(s) != len(pattern):
            return False
        
        hashmap1 = collections.defaultdict(str)
        hashmap2 = collections.defaultdict(str)

        for i in range(len(s)):
            hashmap1[pattern[i]] = s[i]
            hashmap2[s[i]] = pattern[i]

        return ((list(map(hashmap1.get, pattern))) == s) and (''.join(list(map(hashmap2.get, s))) == pattern)