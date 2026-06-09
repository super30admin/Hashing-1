# Time Complexity : O(n2) because we are iterating through the string twice, once for creating the mapping and once for checking the mapping
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes 
# Any problem you faced while coding this : yes, had a hard time understanding the ascii values approach thats why used this one 

#I have used hash map to store the values of the characters in the string s and t, and then I have checked if the mapping is correct or not, if it is correct then I have returned true, otherwise I have returned false.

class Solution(object):
    def isIsomorphic(self, s, t):
        if len(s) != len(t):
            return False

        char_mapping = {}

        for i in range(len(s)):
            original = s[i]
            replacement = t[i]

            if original not in char_mapping:

                if replacement not in char_mapping.values(): 
                    char_mapping[original] = replacement
                else:
                    return False
            else:

                if char_mapping[original] != replacement:
                    return False
        return True
        