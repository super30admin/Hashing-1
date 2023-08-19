// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;
import java.util.HashSet;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        if(s.length() == t.length()) {
            for(int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                if(smap.containsKey(sChar)) { 
                    if(smap.get(sChar) != tChar) return false;
                } else {
                    if(tSet.contains(tChar)) return false;
                    else {
                        smap.put(sChar, tChar);
                        tSet.add(tChar);
                    }
                }
            }
            return true;
        }
        return false;
    }
}

//char sChar = s.charAt(i);
//using 2 maps
// if(s == null && t == null) return true;
//         if(s == null || t == null) return false;
//         HashMap<Character, Character> st = new HashMap<>();
//         HashMap<Character, Character> ts = new HashMap<>();
//         if(s.length() == t.length()) {
//             for(int i = 0; i < s.length(); i++) {
//                 if(st.containsKey(s.charAt(i))) {
//                     if(st.get(s.charAt(i)) != t.charAt(i)) return false;
//                 } else {
//                     st.put(s.charAt(i), t.charAt(i));
//                 }
//                 if(ts.containsKey(t.charAt(i))) {
//                     if(ts.get(t.charAt(i)) != s.charAt(i)) return false;
//                 }else {
//                     ts.put(t.charAt(i), s.charAt(i));
//                 }

//             }
//             return true;
//         }
//         return false;

//using 2 arrays
