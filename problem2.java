// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//  Two HashMaps, sMap and tMap, are used to map characters from
//  string s to characters in string t and vice versa.

import java.util.HashMap;

class problem2 {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        if(s== null || t ==null) return false;
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            } else {
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            }

            if(!tMap.containsKey(tChar)){
                tMap.put(tChar, sChar);
            } else {
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }
        }
        return true;
    }
}