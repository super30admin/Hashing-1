# Time Complexity :
# O(N)  - Length of the strings

# Space Complexity :
# O(1) - the hasp map size has a max limit of 26

# Did this code successfully run on Leetcode :
#Yes

# Any problem you faced while coding this :
#No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping1 = {}
        mapping2 = {}
        #Going through each character and storing the relation at each position 
        #Storing the relation both ways - from string 1 to string 2 as well
        for c1,c2 in zip(s,t):
            #Checking if the relation exists and if it is, is it the same
            if c1 in mapping1:
                if c2 == mapping1[c1]:
                    continue
                else :
                    return False
            else :
                mapping1[c1] = c2

            #Checking if the relation exists and if it is, is it the same
            if c2 in mapping2:
                if c1 == mapping2[c2]:
                    continue
                else :
                    return False
            else :
                mapping2[c2] = c1

        return True
