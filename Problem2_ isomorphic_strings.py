# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#Approach: 1. We initiate two hashmaps that store mappings from string s to t and another from t to s.
#          2. While iterating through the given strings, if we ever find a char that already exists in either of the hashmaps and don't map to the existing corresponding value, we return False
#          3. Else, we keep mapping and return True when the loop ends.
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = {}
        tmap = {}
        if len(s) != len(t):
            return False

        for i in range(len(s)):
            if (s[i] in smap and smap[s[i]] != t[i]) or (t[i] in tmap and tmap[t[i]] != s[i]):
                return False
            tmap[t[i]] = s[i]
            smap[s[i]] = t[i]
        return True