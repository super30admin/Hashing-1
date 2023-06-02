# // Time Complexity : O(N)
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
# Solving this problem using 2 dictionaries.
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict_s = {}
        dict_t = {}
        #Zip will help iterate through both the strings at once
        for char_s , char_t in zip(s,t):
            if char_s not in dict_s: #If there is no entry of char_s, create and set the value to char_t
                dict_s[char_s] = char_t
            else:
                if dict_s[char_s] != char_t: #If there is, check the value is equal to char_t or not; if not, return false
                    return False
            if char_t not in dict_t: #Creating other dictionary to check char_t should corresponds back to char_s3
                dict_t[char_t] = char_s
            else:
                if dict_t[char_t] != char_s:
                    return False
        return True