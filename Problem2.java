// Solution 1
// ## Problem 2: Given two strings s and t, determine if they are isomorphic.
// Two strings are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I didnt face any problem while coding this


class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }else{
                sMap.put(sChar, tChar);
            }
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar) return false;
            }else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}

////Solution 2
//
//class Solution {
//    public boolean isIsomorphic(String s, String t) {
//        if(s == null && t == null) return true;
//        if(s == null || t == null) return false;
//        if(s.length() != t.length()) return false;
//        char[] sMap = new char[256];
//        char[] tMap = new char[256];
//
//        for(int i=0; i<s.length(); i++){
//            char sChar = s.charAt(i); //taking very first character sChar - ' ' (space)
//            char tChar = t.charAt(i);
//            //char array initialized with 0
//            if(sMap[sChar - ' '] != 0){
//                if(sMap[sChar - ' '] != tChar) return false;
//            }else{
//                sMap[sChar - ' '] = tChar;
//            }
//            if(tMap[tChar - ' '] != 0){
//                if(tMap[tChar - ' '] != sChar) return false;
//            }else{
//                tMap[tChar - ' '] = sChar;
//            }
//        }
//        return true;
//    }
//}