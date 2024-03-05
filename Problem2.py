# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(s is None and t is None): return True
        if(s is None or t is None): return False
        if(len(s)!=len(t)): return False

        sMap = {}
        tMap = {}

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            if(sChar not in sMap):
                sMap[sChar] = tChar
            elif(sMap[sChar] != tChar):
                return False
                
            if(tChar not in tMap):
                tMap[tChar] = sChar
            elif(tMap[tChar] != sChar):
                return False
        
        return True
            
sc = Solution()
s = "egg"
t = "add"
print(sc.isIsomorphic(s,t))