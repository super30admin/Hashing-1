/*
Time Complexity : O(n) where n is the number of characters in the string.
Space Complexity : O(1)
Ran on Leetcode : Yes
Approach : Used two Hashmaps for s to t and t to s mappings.
*/

import java.util.HashMap;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i = 0 ; i < s.length(); i++){
            
            if(sMap.containsKey(s.charAt(i))){
                if(sMap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
               sMap.put(s.charAt(i),t.charAt(i)) ;
            }
            
             if(tMap.containsKey(t.charAt(i))){
                if(tMap.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }else{
               tMap.put(t.charAt(i),s.charAt(i)) ;
            }
            
            
        }
        
        return true;      
    }

    public static void main(String args[]){
        Isomorphic isomorphic = new Isomorphic();
        System.out.println(isomorphic.isIsomorphic("egg", "add"));
    }
}