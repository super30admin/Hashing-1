# Hashing-1
Explain your approach in **three sentences only** at top of your code


## Problem 1:
Given an array of strings, group anagrams together.

Example:
Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.
#Approach
# We are solving using Hashmaps, mapping charcount to list of anagrams
# 26 entry total will be tuple of counts

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        output = defaultdict(list)

        for s in strs:
            count = [0] * 26

            for c in s:
                count[ord(c) - ord('a')] += 1

            output[tuple(count)].append(s)

        return output.values()



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

# #Approach
# we need to use two hashmaps
# Lets assume the character c1 is first string and c2 is second string
# we have to check whethet mapping exists in either of the dictionaries
# we are mapping both the characters in both the dictionaries.
# If doesn't exist return false

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map_s = {}
        map_t = {}

        for c1, c2 in zip(s, t):
            print("c1",c1)
            print("c2",c2)
            
            if (c1 not in map_s) and (c2 not in map_t):
                map_s[c1] = c2
                map_t[c2] = c1
                       
            elif map_s.get(c1) != c2 or map_t.get(c2) != c1:
                print("get", map_s.get(c1))
                print("get", map_s.get(c2))

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

#Approach:
# We need to use two hashmaps.
# one hashmap for mapping char to words and other for words to char
# character is not in character word mapping and check word is also in word to char mapping
# if word is already in word to char return false else update both mapping.
# Time complexity : 0(n + m)
# Space Complexity :0(1)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word = {}
        char = {}

        words = s.split(' ') 
        print("words",words)
        if len(words) != len(pattern):
            return False

        for c, w in zip(pattern, words):
            if c not in char:
                if w in word:
                    return False
                else:
                    char[c] = w
                    word[w] = c
            else:
                if char[c] != w:
                    return False

        return True
                