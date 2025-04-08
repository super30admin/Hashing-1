// Time Complexity : O(nklogk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // length of the two string is not equal
        if(s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i=0; i< s.length();i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            // s to t map to store the occurences of same set of char
            if(!sMap.containsKey(sChar)) {
                sMap.put(sChar,tChar);
            } else {
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            }
             // t to s map to store the occurences of same set of char
            if(!tMap.containsKey(tChar)) {
                tMap.put(tChar,sChar);
            } else {
                if(tMap.get(tChar) != sChar) {
                    return false;
                }
            }
        }
         return true; 
    }
}