# Time Complexity : O(N) - no. of char in string
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Trouble with synatxes. 


# Your code here along with comments explaining your approach
# dictionary to map which character in s maps tocharacter in t.
# set to make sure no two different letters from s try to map the same letter in t
# see a character again, check if it still points to the same letter; if the mapping changes return False

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        assigned_value = set()
        mapping = dict()

        for i in range(len(s)):
            char_t = t[i]
            char_s = s[i]

            if char_s in mapping:
                if mapping[char_s] != char_t:
                    return False
            else:
                if char_t in assigned_value:
                    return False
                #new value map it
                mapping[char_s] = char_t
                assigned_value.add(char_t)
        return True