# Hashing-1

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
***********************Approach*********************************
Time Complexity: O(n)2
Space Complexity: O(n)

Approach:
1. Took a pair word with the help of two for loops and passed it to helper function.
2. First Checked whether the length of words is equal or not, if not return false.
2. If true, then added those two words in set and checked the length of the set.
3. If length of the set is equal to length of words, then return true else return false.

Optimization:
1. Created a list to keep the indexes of already existing anagrams, for example, first words has two anagrams in the list then did not visited those two anagrams again in the next iteration, started with new word.

******************************************************************************************************
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

*********************************Approach***************************************************
Time complexity: O(n)
Space Complexity: O(n)

1. Checked the length of two words, if they are not equal return false.
2. Created a map of type Character and Character as key and value pair.
3. One on One mapping with both string characters.
4. If more than one mapping found, return false else continue till the end and return true. 
********************************************************************************************

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

*******************************************Approach***********************************************
Time complexity: O(n)
Space Complexity: O(n)

1. Convered str to string array and checked the length of that array with pattern, if not equal return false.
2. Created a map of type Character and String as key and value pair.
3. One on One mapping with character in pattern and string in array.
4. If more than one mapping found, return false else continue till the end and return true. 


