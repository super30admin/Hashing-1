//Time Complexity: O(n) n is the number of elements and k is the average length.
//Space Complexity: O(1) the total hashmap will be of size 26

/*
 * the idea is to create two hashmap and map the elements with eachother.
 * and check if the element exists already and not equal to the exisiting one we return false else true.
 */

import java.util.HashMap;

class IsomorphicString{
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap <Character, Character> sMap = new HashMap<>();
        HashMap <Character, Character> tMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }
            else{
                sMap.put(sChar, tChar);
            }
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar) return false;
            }
            else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}