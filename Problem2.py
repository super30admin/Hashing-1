# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s==None and t==None:
            return True
        if s==None or t==None:
            return False
        if len(s)!=len(t):
            return False
        
        smap={}
        tmap={}

        for i in range(0,len(s)):
            sChar=s[i]
            tChar=t[i]

            if sChar in smap:
                if smap.get(sChar)!=tChar:
                    return False
            else:
                smap[sChar]=tChar

            if tChar in tmap:
                if tmap.get(tChar)!=sChar:
                    return False
            else:
                tmap[tChar]=sChar 

        return True          
        
        