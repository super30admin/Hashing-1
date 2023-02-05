# Author: NAVEEN US
# Date: 05.02.2023
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = dict()
        tset = set()
        for i in range(len(s)):
            if s[i] in smap.keys():
                if smap[s[i]] != t[i]:
                    #print(smap,tset,"1")
                    return False                  
            else:
                if t[i] in tset:
                    #print(smap,tset,"2")
                    return False
                smap[s[i]]=t[i]
                tset.add(t[i])
        print(smap,tset)
        return True
