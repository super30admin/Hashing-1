'''
Problem: Isomorphic Strings
Time Complexity: O(n), where n is length of s or t
Space Complexity: O(1), max it will store 26 alphabets
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        take 2 dictionary
        traverse character in s and t and push it to the dictionary
        if mapping already exists then return false 
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False

        dicts={}
        dictt={}

        for i, j  in zip(s,t):
            if i not in dicts and j not in dictt:
                dicts[i] = j
                dictt[j] = i
            elif dicts.get(i)!=j or dictt.get(j)!=i:
                return False
        
        return True