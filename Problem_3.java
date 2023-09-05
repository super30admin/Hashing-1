/*
 
Problem 2 : Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Time Complexity : O(nk)
Space Complexity : O(1)
Did it run on LeetCode : Yes
Any issues encountered : No

Approach : Used two hashmaps to keep track of the key value pair being formed w.r.t
each of the strings and verifying if the values are always the same.

*/



import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] list = s.split(" ");
        if(pattern.length() != list.length){
            return false;
        }
        HashMap<Character, String> Smap = new HashMap<>();
        HashMap<String, Character> Tmap = new HashMap<>();
        for(int i=0; i<pattern.length();i++){
            Character p = pattern.charAt(i);
            if(!Smap.containsKey(p)){
                Smap.put(p, list[i]);
            }
            else{
                if(!Smap.get(p).equals(list[i])){
                    return false;
                }
            }
            if(!Tmap.containsKey(list[i])){
                Tmap.put(list[i], p);
            }
            else{
                if(!Tmap.get(list[i]).equals(p)){
                    return false;
                }
            }
        }
        
        return true;
    }
}
