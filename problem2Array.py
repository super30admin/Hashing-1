"""
Time Complexity : O(n) where n is the number of letters in the s or t.
Space Complexity : O(1) as maximum we will store 256 chars in hashMap as Total number of ascii charaters are 256


Did this code successfully run on Leetcode : Yes

Your code here along with comments explaining your approach:
1. Create two char arrays of length 256 and initalized to 0
2. Calculate the ASCII value of characters from s and t strings and store in s and t arrays.
3. If one to one mapping exists between these two arrays return True else return False
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sChars = [0] * 256
        tChars = [0] * 256
        
        for i in range(len(s)):
            if sChars[ord(s[i]) - ord(' ')] != 0:
                if sChars[ord(s[i]) - ord(' ')] != t[i]:
                    return False
            else:
                sChars[ord(s[i]) - ord(' ')] = t[i]
            
            if tChars[ord(t[i]) - ord(' ')] != 0:
                if tChars[ord(t[i]) - ord(' ')] != s[i]:
                    return False
            else:
                tChars[ord(t[i]) - ord(' ')] = s[i]
        
        return True