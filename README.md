# Hashing-1
Explain your approach in **three sentences only** at top of your code


## Problem 1:
Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.


//O(nklogk)
//O(nk) space complexity
//Basically, create a hashmap with sorted string as keys and store all the words that contain these sorted keys. Return the values of the hashmap.
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = {}
        for i in strs: # O(n)
            key = ''.join(sorted(i)) # k= max length of string and O(log k) for sorting the string. So O(klogk)
            if key not in res.keys():
                res[key] = []
            res[key].append(i)
        return list(res.values())



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

//O(n) time complexity
//O(1) space complexity
// create 2 hashmaps, one to map values from s->t, and other to map values from t->s. If anytime the value does not map to existing mapping then return false. if value not found in hashmap then add it. 

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        hash1 = {}
        hash2 = {}
        for i in range(len(s)):
            if s[i] not in hash1.keys():
                hash1[s[i]] = t[i]
            
            if hash1[s[i]] != t[i]:
                return False
            
            if t[i] not in hash2.keys():
                hash2[t[i]] = s[i]
            else:
                if hash2[t[i]] != s[i]:
                    return False

        return True


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


//O(n) time complexity
//O(n) space complexity
//Similar to problem 2. Just words in second hashmap instead of letters.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        matching_p = s.split(' ')
        if len(pattern) != len(matching_p):
            return False

        hash1 = {}
        hash2 = {}
        for i in range(len(pattern)):
            if pattern[i] not in hash1.keys():
                hash1[pattern[i]] = matching_p[i]
            
            if hash1[pattern[i]] != matching_p[i]:
                return False
            print(hash1,hash2)
            if matching_p[i] not in hash2.keys():
                hash2[matching_p[i]] = pattern[i]
            else:
                if hash2[matching_p[i]] != pattern[i]:
                    return False

        return True
        


