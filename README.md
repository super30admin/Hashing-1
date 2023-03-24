# Hashing-1
Explain your approach in **three sentences only** at top of your code


## Problem 1:
Given an array of strings, group anagrams together.

# time complexcity : o(nklogk)
# as n elements for each element it is klogk 
# space complexcity : o(k)
# sort the elements and have key as sorted element an dthe other as values
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return []

        hashMap = {}
        for string in strs:
            sortedstring = tuple(sorted(string))
            print(sortedstring)
            ## if the new element doesnot exists then we create an key for it
            if hashMap.get(sortedstring) == None:
                hashMap[sortedstring] = []
            hashMap[sortedstring].append(string)
        return hashMap.values()

## Problem 2:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

## Hash map: key value pairs
## hash map doesnot allows duplicate values
## hash set contains unique values
## N is the length of each string and space complexcity : 0(1)
## s hashMap and t hashset  but these doesnot give the proper 
## to search is hash map if I need corresponding value
## if it is only a key hash set
## we can do with single hash map using s_variable and t_variable - o(n)- time complexcity and o(1)- space complexcity 
## we do this with 2 hash maps for each word 
## 1 hash Map
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return false 
        Map = {}
        for i in range(len(s)):
             sChar = s[i]
             tChar = t[i]
             if sMap.get(sChar)!= None:
                 if sMap[sChar] !=  tChar:
                     return False
             else:
                 if tChar in tMap:
                     return False
                 sMap[sChar] = tChar
                 tMap.add(tChar) 
        return True
    

## Problem 3:
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# Time complexcity : o(n)
# space complexcity : o(1)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        strArray = s.split(' ')
        if len(pattern) != len(strArray):
            return False
        patternMap = {}
        strMap = {}
        for i in range(len(pattern)):
            patternChar = pattern[i]
            string = strArray[i]
            if patternMap.get(patternChar)!= None:
                if patternMap[patternChar] != string:
                    return False
            else:
                patternMap[patternChar] = string
            if strMap.get(string) != None:
                if strMap[string] != patternChar:
                    return False
            else:
                strMap[string] = patternChar
        return True
