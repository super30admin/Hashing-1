"""
Problem : 2
Time Complexity : O(1)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
taking two hashmaps to store mapping from pattern to s and s to pattern
"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        sdict={}
        tdict={}
        if len(s)!=len(t):
            return False
        for i,j in zip(s,t):
            if i in sdict:
                if sdict[i]!=j:
                    return False
            else:
                sdict[i]=j
            if j in tdict:
                if tdict[j]!=i:
                    return False
            else:
                tdict[j]=i
        return True