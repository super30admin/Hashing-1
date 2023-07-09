/*
 * Time complexity: O(N)
 * Space Complexity: O(N) 
 * Successfully ran this code on leetcode
 */

import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s+");
        if(pattern.length() != words.length)
            return false;
        String[] hash = new String[26];
        HashMap<String, Character> r_hash= new HashMap<>();
        char[] pchars = pattern.toCharArray();
        
        for(int i=0; i<pchars.length; i++){
            System.out.println("i: "+ i);
            if(hash[pchars[i] - 'a'] != null){
                if(!words[i].equals(hash[pchars[i] - 'a'])){
                    return false;
                }
            }
            else {
                hash[pchars[i] - 'a'] = words[i]; 
            }
            
            
            if(r_hash.containsKey(words[i])){
                if(pchars[i] != r_hash.get(words[i])){
                    return false;
                }
            }
            else {
                r_hash.put(words[i], pchars[i]);
            }
            
        }

        return true;
    }
}