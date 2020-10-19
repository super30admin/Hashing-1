# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach
# Initialize two maps
# Traverse over the strings, store the character from first string as a key and char from second string as value in one map and vice versa in the other.
# Check if the char from one string maches the value from other and return False if there is a mismatch.

class Solution:
    def isIsomorphic(self, s:str, t:str) -> bool:
        
        if not s and not t:
            return True
        
        if len(s) == 0:
            return len(t) == 0
        
        if len(s) != len(t):
            return False
        
        s_map = {}
        t_map = {}
        
        for i in range(len(s)):
            c1 = s[i]
            c2 = t[i]
            
            if c1 in s_map:
                if s_map[c1] != c2:
                    return False
            if c2 in t_map:
                if t_map[c2] != c1:
                    return False
                
            s_map[c1] = c2
            t_map[c2] = c1
            
        return True