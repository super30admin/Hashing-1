# Time Complexity : O(N) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am using two hashmaps to store the mapping of characters from s to t and t to s. I check if the value is repeated for the same key.
# If it is then I return false. Else iterate through the string and populate the hashmaps. And return true.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = {}

        for i in range(len(s)):
            if s[i] in sMap:
                if sMap[s[i]] != t[i]:
                    return False
            sMap[s[i]]=t[i]
            if t[i] in tMap:
                if tMap[t[i]] != s[i]:
                    return False
            tMap[t[i]]=s[i]
            # print("sMap",sMap)
            # print("tMap",tMap)
        return True



        