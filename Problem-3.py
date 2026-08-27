#Time Complexity : O(n+m)
#Space Complexity : O(n+m)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        p = list(pattern)
        s = s.split(' ')
  
        h = {}

        if len(p) != len(s):
            return False

        for i in range(len(p)):
            if p[i] in h and s[i] != h[p[i]]:
                return False
            elif p[i] not in h and s[i] in h.values():
                 return False
            else:
                h[p[i]] = s[i]
        
        return True
