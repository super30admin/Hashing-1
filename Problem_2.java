/*
 
Problem 2 : Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Time Complexity : O(n)
Space Complexity : O(1)
Did it run on LeetCode : Yes
Any issues encountered : No

Approach : Used to hashmaps to keep track of the key value pair being formed w.r.t
each of the strings and verifying if the values are always the same

*/

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> s_map = new HashMap<>();
        HashMap<Character, Character> t_map = new HashMap<>();

        int len = 0;
        while(len < s.length()){
            char schar = s.charAt(len);
            char tchar = t.charAt(len);
            if(!s_map.containsKey(schar)){
                s_map.put(schar,tchar);
            }
            else{
                if(s_map.get(schar) != tchar){
                    return false;
                }
            }
            if(!t_map.containsKey(tchar)){
                t_map.put(tchar,schar);
            }
            else{
                if(t_map.get(tchar) != schar){
                    return false;
                }
            }
            len++;
        }
        return true;
    }
}

// Approach 2 

class Solution_2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> s_map = new HashMap<>();
        HashMap<Character, Character> t_map = new HashMap<>();

        int len = 0;
        while(len < s.length()){
            if(s_map.containsKey(s.charAt(len))){
                if(t_map.containsKey(t.charAt(len))){
                    if(t_map.get(t.charAt(len)) != s.charAt(len)){
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else{
                if(!t_map.containsKey(t.charAt(len))){
                    s_map.put(s.charAt(len),t.charAt(len));
                    t_map.put(t.charAt(len),s.charAt(len));
                }
                else{
                    return false;
                }
            }
            len++;
        }
        return true;
    }
}