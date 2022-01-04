#Word Pattern - Leetcode 290
# T.C => O(n)
# S.C => O(1)
# Approach:- We made two variables to store value of corresponding s and t. Just sort both the string to check the mapping.
# If the values gets correctely mapped then return true or else return false

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # return sorted(s) == sorted(t)
        one  = "".join(sorted(s))
        two = "".join(sorted(t))
        
        if one == two:
            return True
        else:
            return False