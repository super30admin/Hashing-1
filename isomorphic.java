// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

class isomorphicSolution {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sTotMap = new HashMap<>();
        HashMap<Character, Character> tTosMap = new HashMap<>();
        
        if (s.length() != t.length()) {
            return false;
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(sTotMap.containsKey(s.charAt(i))) {
                if(sTotMap.get(s.charAt(i)) != t.charAt(i)) { 
                    // check if both the maps contain same value mapped to key or not
                    return false;
                }
            }
            else {
                sTotMap.put(s.charAt(i), t.charAt(i));
            }
                   
            if(tTosMap.containsKey(t.charAt(i))) {
                if(tTosMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
            else {
                tTosMap.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s, t;
        s = "egg";
        t = "add";
        boolean result;
        result = isIsomorphic(s, t);
        System.out.print(result);
    }
}