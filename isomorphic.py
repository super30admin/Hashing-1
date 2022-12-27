# Time Complexity :
# O(N)  - Length of the strings

# Space Complexity :
# O(1) - the hasp map size has a max limit of 26

# Did this code successfully run on Leetcode :
#Yes

# Any problem you faced while coding this :
#No

#Storing the relation both ways - from string 1 to string 2 as well
#Going through each character and checking if this mapping exists before - if it does - then we check if it's the same mapping 
# If it's the same mapping, then there is no problem, but if it's a new mapping then it means it is not isomorphic 
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping1 = {}
        mapping2 = {}
        for c1,c2 in zip(s,t):
            if c1 in mapping1:
                if c2 == mapping1[c1]:
                    continue
                else :
                    return False
            else :
                mapping1[c1] = c2

            if c2 in mapping2:
                if c1 == mapping2[c2]:
                    continue
                else :
                    return False
            else :
                mapping2[c2] = c1

        return True
