// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach in three sentences only
/*
 * Used two hashMaps, inserted char of s as key and char of t as value and vice versa
 * Added checks before inserting a new key value , if map contains key and does the value is same as the new value else return false
 * Also before inserting in smap verify that if tmap has the key and the value is same 
 */

// Java code to implement the approach

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        if (s.equals("") || t.equals("")) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        // int[] mapS = new int[256];
        // int[] mapT = new int[256];

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i <= s.length() - 1; i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // if (mapS[s.charAt(i)] != mapT[t.charAt(i)]) {
            // return false;
            // }
            // mapS[s.charAt(i)] = i + 1;
            // mapT[t.charAt(i)] = i + 1;

            if (sMap.containsKey(sChar)) {
                if (!sMap.get(sChar).equals(tChar)) {
                    return false;
                }
            } else {
                if (tMap.containsKey(tChar)) {
                    if (!tMap.get(tChar).equals(sChar)) {
                        return false;
                    }
                }
                sMap.put(sChar, tChar);
            }

            if (tMap.containsKey(tChar)) {
                if (!tMap.get(tChar).equals(sChar)) {
                    return false;
                }
            } else {
                if (sMap.containsKey(sChar)) {
                    if (!sMap.get(sChar).equals(tChar)) {
                        return false;
                    }
                }
                tMap.put(tChar, sChar);
            }

        }

        return true;
    }
}
