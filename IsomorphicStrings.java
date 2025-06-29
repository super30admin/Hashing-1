// Time complexity : O(n) where n is length of the string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// Problem 2:
// Given two strings s and t, determine if they are isomorphic.
// Two strings are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

// Example 1:
// Input: s = "egg", t = "add"
// Output: true

// Example 2:
// Input: s = "foo", t = "bar"
// Output: false

// Example 3:
// Input: s = "paper", t = "title"
// Output: true
// Note:
// You may assume both s and t have the same length.

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Base Case
        if (s.length() != t.length()){
            return false;
        }

        // HashMap used to store mapping from s → t and t → s using string keys
        // Format: "s_char" → tChar, "t_char" → sChar
        HashMap<String, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Prefix keys to distinguish s and t characters in the same map
            String sKey = "s_" + sChar;
            String tKey = "t_" + tChar;

            if(!map.containsKey(sKey)){
                map.put(sKey, tChar);
                if(map.containsKey(tKey)){
                    return false;
                }
                map.put(tKey, sChar);
            }
            else{
                if(map.get(sKey) != tChar){
                    return false;
                }
            }
        }

        // Returning true as all mappings are valid and strings are isomorphic
        return true;
    }
}