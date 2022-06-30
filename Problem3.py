'''
## Problem 3:
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:
Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false

Example 4:
Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

'''

'''
Time Complexity : O(N)
Space Complexity : O(1)
'''
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        '''
        split word string and store in array
        create a hashmap and hashset
        loop through pattern
        if pattern in hashmap and value is not same as s[i] then return false
        else if s[i] already in hashset then return False
        '''
        arr = list(s.split(" "))
        if(len(arr)!=len(pattern)):
            return False
        s = pattern
        hm = {}
        hs = set()
        for i in range(len(s)):
            if s[i] not in hm:
                if(arr[i] in hs):
                    return False
                hm[s[i]] = arr[i]
                hs.add(arr[i])
            else :
                if hm[s[i]] != arr[i]:
                    return False
        return True
