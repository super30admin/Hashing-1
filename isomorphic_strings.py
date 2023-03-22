# Time Complexity : O(n) as we are iterating through the strings
# Space Complexity : O(n) as we are storing the mapping in the hashmap
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this piece of code we are storing a possible one-to-one mapping between the characters of s and t. 
We save it twice in hashmap1 and hashmap2 to ensure that the one-to-one mapping is maintained from 
s to t and from t to s as well. We then check if the mapping is correct by comparing the strings with 
the mapping. If the mapping is correct, then the strings are isomorphic.
"""

import collections

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap1 = collections.defaultdict(str)
        hashmap2 = collections.defaultdict(str)

        for i in range(len(s)):
            hashmap1[t[i]] = s[i]
            hashmap2[s[i]] = t[i]

        return (''.join(list(map(hashmap1.get, t))) == s) and (''.join(list(map(hashmap2.get, s))) == t)