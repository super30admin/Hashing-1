# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :None

# Your code here along with comments explaining your approach in three sentences only
#maintain 2 hashmaps one for s to t mapping and other for t to s mapping

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        stack1 = {}
        stack2 = {}
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] in stack1.keys() and stack1[s[i]] != t[i]:
                return False
            elif t[i] in stack2.keys() and stack2[t[i]] != s[i]:
                return False
            elif s[i] not in stack1.keys() and t[i] not in stack2.keys():
                stack1[s[i]] = t[i]
                stack2[t[i]] = s[i]
        return True