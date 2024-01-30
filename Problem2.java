// https://leetcode.com/problems/isomorphic-strings/description/

// ## Problem 2:
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


// Approach--------------------
// Store mappings from s to t.
// Store all the values mapped in a set.
// If the mapping from s to t is different, or a character in t is already map(present in set),
// then there is a breach and we return false.

import java.util.HashMap;
import java.util.HashSet;

class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        // Stores mappings from s to t
        HashMap<Character, Character> sToTMap = new HashMap<>();
        // Store already used mappings 
        HashSet<Character> mappingsUsed = new HashSet<>();

        for(int i=0;i<s.length();i++){
            // Check if character was already mapped
            if(sToTMap.containsKey(s.charAt(i))){
                // If mapped to same character do nothing
                if(sToTMap.get(s.charAt(i))==t.charAt(i))  continue;
                // If mapped before to a different character
                else return false;
            }
            // Character not mapped
            else{
                // Check if the same mapping has already been used
                if(mappingsUsed.contains(t.charAt(i))) return false;
                else{
                    sToTMap.put(s.charAt(i), t.charAt(i));
                    mappingsUsed.add(t.charAt(i));
                }
            }
        }

        return true;
    }
}
