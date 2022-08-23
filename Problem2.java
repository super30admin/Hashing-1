import java.util.HashMap;

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

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //time - O(n)
        // space - O(1)
        // 2 hash map solution
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (smap.containsKey(schar)) {
                if (smap.get(schar) != tchar) return false;
            } else {
                smap.put(schar,tchar);
            }
            
              if (tmap.containsKey(tchar)) {
                if (tmap.get(tchar) != schar) return false;
            } else {
                tmap.put(tchar,schar);
            }
        }
        return true;
    }
}

