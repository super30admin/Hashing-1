'''
Problem: Word Pattern
Time Complexity: O(n), where n is length of pattern
Space Complexity: O(1), constant as alphabets
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        split the string into list
        storing pattern character as key and word as value in dictionary
        if already used element is found return false  
'''

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dicts = {}
        s = s.split()
        if len(pattern) != len(s):
            return False

        for c, ele in zip(pattern, s):
            if c not in dicts:
                if ele in dicts.values():
                    return False
                dicts[c] = ele
            else:
                if dicts[c]!= ele:
                    return False
        
        return True
