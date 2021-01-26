// Time Complexity : O(n)
// Space Complexity : O(n + k) where 'k' is the length of strings
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : coding the logic for reverse mapping

import java.util.*;
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
     
        String[] splits = s.split(" ");
       
        if(pattern.length() != splits.length) {
            return false;
        }
        
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i=0; i<pattern.length(); i++) {

            char currChar = pattern.charAt(i);
            String currString = splits[i];

            if(map1.containsKey(currChar)) {
                if(!map1.get(currChar).equals(currString)) {
                    return false;
                }
            } else {
                if(map2.containsKey(currString)) {
                    return false;
                } 

                map1.put(currChar, currString);
                map2.put(currString, currChar);
            }

        }

        return true;
    }    
}