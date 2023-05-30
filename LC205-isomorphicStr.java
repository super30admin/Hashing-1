/*
 * Time complexity = O(N)
 * Space Complexity = O(1)
 */

import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {

        // method-1 : use 2 maps (source to target, target to source) to maintain mapping. 
        // Time = O(n), Space = O(1) because max size will be 26 key-value pair

        // method-2 : one Map and one set, that way, we will reduce some space but nothing major
        // Time : O(n), Space = O(1)

        // I will implement Method-2

        HashMap<Character, Character> srcMap = new HashMap<Character, Character> ();
        HashSet<Character> trgtSet = new HashSet<Character> ();

        if (s.length() == t.length()) {
            for (int i=0; i< s.length(); i++){

                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                
                if (!srcMap.containsKey(sChar)) {
                    if (trgtSet.contains(tChar)) return false;
                    srcMap.put(sChar, tChar);
                    trgtSet.add(tChar);
                } else {
                    if (srcMap.get(sChar) != tChar) return false;
                }
            }
        }
        return true;        
    }
}