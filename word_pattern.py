# Time Complexity :
# O(N)  - Length of the strings

# Space Complexity :
# O(1) - the hash map size has a max limit of 26

# Did this code successfully run on Leetcode :
#Yes

# Any problem you faced while coding this :
#No

#We can treat this problem very similarly to the word isomorphism problem
# Here we are trying to find a mapping between a string in the pattern and a word in the string

#Hence, we Store the relation both ways - from character 1 to string 1 and string 1 to character 1 and so on
#Going through each character and checking if this mapping exists before - if it does - then we check if it's the same mapping 
# If it's the same mapping, then there is no problem, but if it's a new mapping then it means it is not isomorphic 
#We do the same for each string as well

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map1 = {}
        map2 = {}
        strs = s.split(" ")

        if len(strs) != len(pattern):
            return False

        for char1,str1 in zip(pattern,strs):
            if char1 in map1 :
                if map1[char1] == str1 :
                    continue
                else :
                    return False
            else :
                map1[char1] = str1

            if str1 in map2 :
                if map2[str1] == char1 :
                    continue
                else :
                    return False
            else :
                map2[str1] = char1

        return True
