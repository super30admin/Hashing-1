/*
 * Approach: Here i am implementing this by using two seperate HashMap to map char of string t -> s
 *  and vice versa. At any point if i get a key already exsting and if the value doesnt matach with the value of other string at that particular iteration then we directly return false. 
 
 * T.C:  O(n) length of the string max(s,t).
 * S.C: O(1) 
*/

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Character> sMap = new HashMap<>(26);
        HashMap<Character,Character> tMap = new HashMap<>(26);

        for(int i =0; i< s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.get(sChar) != null){
                if(sMap.get(sChar) != tChar) return false;
            }

            sMap.put(sChar,tChar);
        }

        for(int i =0; i< s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(tMap.get(tChar) != null){
                if(tMap.get(tChar) != sChar) return false;
            }

            tMap.put(tChar,sChar);
        }
     return true;
    }
}