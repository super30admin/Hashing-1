# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        t = s.split(" ")
        s = pattern

        if len(s) != len(t):    return False

        hashMap, hashSet = {}, set()
        for i in range(len(s)):
            if s[i] in hashMap.keys():
                if hashMap[s[i]] != t[i]:   return False
            else:
                if t[i] in hashSet: return False
                hashMap[s[i]] = t[i]
                hashSet.add(t[i])
        return True