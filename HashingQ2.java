import java.util.HashMap;
import java.util.Map;

// TC:O(n)
// SC:O(1)
//## Problem 2:
//        Given two strings s and t, determine if they are isomorphic.
//        Two strings are isomorphic if the characters in s can be replaced to get t.
//        All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//
//        Example 1:
//        Input: s = "egg", t = "add"
//        Output: true
//
//        Example 2:
//        Input: s = "foo", t = "bar"
//        Output: false
//
//        Example 3:
//        Input: s = "paper", t = "title"
//        Output: true
//        Note:
//        You may assume both s and t have the same length.
public class HashingQ2 {
    public boolean isIsomorphic(String s, String t) {
        char[] sMap = new char[256];
        char[] set = new char[256];
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap[sChar-' ']!=0){ //Subtracting with space to consider all elements with ascii values
                if(sMap[sChar - ' '] != tChar) return false;
            }else{
                if(set[tChar-' '] != 0) return false;
                set[tChar-' ']= tChar;
                sMap[sChar - ' ']= tChar;
            }

        }
        return true;

    }

//    public boolean isIsomorphic(String s, String t) {
//        Map<Character, Integer> m1 = new HashMap<>();
//        Map<Character, Integer> m2 = new HashMap<>();
//
//        for(Integer i = 0; i < s.length(); i++) {
//            if(m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i)) {
//                return false;
//            }
//        }
//        System.out.println(m1);
//        System.out.println(m2);
//        return true;

//    public boolean isIsomorphic(String s, String t) {
//        HashMap<Character, Character> sMap = new HashMap<>();
//        Set<Character> set = new HashSet<>();
//        for(int i = 0; i < s.length(); i++){
//            char sChar = s.charAt(i);
//            char tChar = t.charAt(i);
//
//            if(sMap.containsKey(sChar)){
//                if(sMap.get(sChar) != tChar) return false;
//            }else{
//                if(set.contains(tChar)) return false;
//                set.add(tChar);
//                sMap.put(sChar, tChar);
//            }
//
//        }
//        return true;
//
//
//    }
}
