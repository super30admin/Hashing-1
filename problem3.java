
// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int wlen = words.length;
        int slen = pattern.length();
        if(wlen != slen){
            return false;
        }
        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> wmap = new HashMap<>();
        for(int i=0; i < slen ; i++){
            char ch = pattern.charAt(i);
            if(pmap.containsKey(ch)){
               if(!pmap.get(ch).equals(words[i])) return false;
            }
            else{
             pmap.put(ch, words[i]);
            }
            if(wmap.containsKey(words[i])){
               if(!wmap.get(words[i]).equals(ch)) return false;
            }
            else{
             wmap.put(words[i], ch);
            }
        }
        return true;
    }
}