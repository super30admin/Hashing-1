// Time complexity : O(n) where n is number of characters in pattern
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// Problem 3:
// Given a pattern and a string str, find if str follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

// Example 1:
// Input: pattern = "abba", str = "dog cat cat dog"
// Output: true

// Example 2:
// Input:pattern = "abba", str = "dog cat cat fish"
// Output: false

// Example 3:
// Input: pattern = "aaaa", str = "dog cat cat dog"
// Output: false

// Example 4:
// Input: pattern = "abba", str = "dog dog dog dog"
// Output: false
// Notes:
// You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" "); // Splitting input string into words

        if(pattern.length() != words.length){
            return false;
        }

        HashMap<Character, String> map = new HashMap<>(); // Map to store character -> word mapping
        HashSet<String> set = new HashSet<>(); // Set to track already mapped words
        for(int i = 0; i < pattern.length(); i++){
            String str = words[i];
            char c = pattern.charAt(i);

            if(!map.containsKey(c)){
                map.put(c, str);
                if(set.contains(str)){
                    return false;
                }
                set.add(str);
            }
            else {
                if(!map.get(c).equals(str)){
                    return false;
                }
            }
        }
        // Returning true as all checks passed and pattern matches
        return true;
    }
}