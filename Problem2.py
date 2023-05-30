# Time Complexity : O(n) since for each of the n strings, we are performing an O(1) check
# Space Complexity : O(n) for the 2 hashmaps
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# We use 2 hashmaps here to keep track of bidirectional mapping between characters.
# We use 2 hashmaps instead of one so that we do not confuse the reverse mapping with the forward mapping entries.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        st = {}
        ts = {}
        if len(s) != len(t):
            return False

        for i in range(len(s)):
            if s[i] in st and st[s[i]] != t[i]:
                return False
            st[s[i]] = t[i]
            if t[i] in ts and ts[t[i]] != s[i]:
                return False            
            ts[t[i]] = s[i]
        
        return True            
