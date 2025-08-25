# Hashing-1
Explain your approach in **three sentences only** at top of your code

I group words by sorting their characters, since anagrams will share the same sorted string as a key.
A HashMap is used where each key is the sorted word and the value is a list of its anagrams.
Finally, I return all the grouped lists from the map as the result.

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

##Solution 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> anagram = new HashMap<>();  //creating hashmap
        for (String s : strs){ // am looping through each word in input 
        char[] array = s.toCharArray();// am converting words to character array
        Arrays.sort(array); //am sorting it so that am making all the words to be same 
        String key = new String(array);// am creating an object to convert it back to string and maping in to key 

            // If the key does not exist in the map, create a new list for it
            if (!anagram.containsKey(key)) {
                anagram.put(key, new ArrayList<String>());
            }

            // Add the current word to the corresponding list
            anagram.get(key).add(s);
        

        }
        return new ArrayList<List<String>>(anagram.values());

       

        
    }
}
Time complexity: O(n.m)
m = total number of input string given 
n = average length of strs

Space Complexity: O(n * m) 

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
