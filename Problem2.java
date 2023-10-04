//Given two strings s and t, determine if they are isomorphic. 
// Two strings are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while 
// preserving the order of characters. No two characters 
// may map to the same character but a character may map to itself.
// Time Complexity : O(s)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -

import java.util.HashMap;
import java.util.HashSet;

class Solution {

  public boolean isIsomorphic(String s, String t) {
    if (s == null && t == null) return true;
    if (s == null || t == null) return false;

    HashMap<Character, Character> sMap = new HashMap<>();
    HashSet<Character> tSet = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);

      if (sMap.containsKey(sChar)) {
        if (sMap.get(sChar) != tChar) return false;
      } else {
        if (tSet.contains(tChar)) return false; else {
          sMap.put(sChar, tChar);
          tSet.add(tChar);
        }
      }
    }
    return true;
  }
}

class Problem2 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.isIsomorphic("egg", "add"));
  }
}
