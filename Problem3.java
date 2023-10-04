// Given a pattern and a string str, find if str follows the same pattern.
//  Here follow means a full match, such that there is a 
// bisection between a letter in pattern and a non-empty word in str.
// Time Complexity : O(n^2)
// Space Complexity : O(m) m - number of unique characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -

import java.util.*;

class Solution {

  public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    if (words.length != pattern.length()) return false;
    HashMap map = new HashMap();
    for (int i = 0; i < words.length; ++i){
      if (map.put(pattern.charAt(i), i) != map.put(words[i], i)) return false;
    }
    return true;
  }
}

class Problem3 {

  public static void main(String[] args) {
    String pattern = "abba";
    String s = "dog cat cat dog";
    Solution sol = new Solution();

    System.out.println(sol.wordPattern(pattern, s));
  }
}
