/* Time Complexity :  O(n) - traverse the entire string*/
/* Space Complexity : O(256) ~ O(1)  - constant - as the input would contain chars from these 256 ASCII characters*/
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false; // both or one of the input strings is null
        if(s.length() != t.length()) return false; // lengths of the input strings is not equal

        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        //loop - traverse through the string
        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //If char's mapping already present, check if the existing mapping is same as that of current chars
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }//mapping not present
            else{
                //tchar is already present in the Set ==> return false. Else add values to the map and set
                if(tSet.contains(tChar)) return false;
                else{
                    sMap.put(sChar, tChar);
                    tSet.add(tChar);
                }
            }
        }
        return true;        
    }
}
