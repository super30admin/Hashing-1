'''

## Problem 2:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.

'''
'''
Time Complexity : O(N)
Space Complexity : O(1)
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmaps = {}
        hashmapt = {}
        '''
        i will take two hashmaps and add mapping of s-t in hashmaps and t-s in hashmapt
        check if s is present in hashmap 
        if yes check if it's value is equal to t else return false
        check if t is already in hashmapt if yes and s-t is first occurence return false 
        '''
        for i in range(len(s)):
            if s[i] not in hashmaps:
                hashmaps[s[i]] = t[i]
                if(t[i] in hashmapt):
                    return False
                else :
                    hashmapt[t[i]] = s[i]
                
            else :
                if(t[i] not in hashmapt or hashmapt[t[i]] != s[i]):
                    return False
        return True