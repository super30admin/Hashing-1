# Time Complexity : O(N)
# Space Complexity : O(1) #26 chars
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        h = {}
        
        for i in range(len(s)):
            k = s[i]
            if k in h.keys():
                if h[k]!=t[i]:
                    return False
            else:
                if t[i] in h.values():  
                    return False
                h[k]=t[i]
        return True

obj = Solution()
s = 'paper'
t = 'title'

print(obj.isIsomorphic(s,t))
