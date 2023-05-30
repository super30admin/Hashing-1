#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


#Used hashMap to check if the mapping exists or not. If it exists, then another check is made to find if there is no circular mapping.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s1 = dict()
        t1 = dict()

        for i,j in zip(s,t):
            if (i in s1.keys() and s1[i] != j) or (j in t1.keys() and t1[j] != i):
                return False
            s1[i] = j
            t1[j] = i
        return True