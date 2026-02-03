'''
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this :  No
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap = {}
        taken = []
        for i in range(len(s)):
            if s[i] in hashmap:
                if hashmap[s[i]] != t[i]:
                    return False
            else:
                if t[i] in taken:
                    return False
                taken.append(t[i])
                hashmap[s[i]] = t[i]
        return True