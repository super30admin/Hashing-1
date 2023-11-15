// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class problem1 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>(); // add charecters to map and set 
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(!map.containsKey(sChar)){ // check if char is present in map and set
                if(set.contains(tChar)){
                    return false;
                }else{
                    map.put(sChar,tChar);
                    set.add(tChar);
                }
            }else{
               if(map.get(sChar) != tChar){
                   return false;
               }
            }
        }
        return true;
        
    }

     public static void main(String[] arg) {
        String s = "egg";
        String t = "adc";
        System.out.println(isIsomorphic(s,t));
    }
}