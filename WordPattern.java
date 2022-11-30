//Time Complexity: O(n) n is the number of elements.
//Space Complexity: O(1) the total hashmap will be of size 26

/*
 * The idea is to create two hashmap and map the character of pattern to string and vis a versa.
 * if the element already occurs in hashmap then we compare it else we add the element to hashmap.
*/

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if (pattern.length() == 0 || s.length() == 0) return false;
        HashMap <Character, String> pmap = new HashMap<>();
        HashMap <String, Character> smap = new HashMap<>();
        String[] strArr = s.split(" ");
        if(strArr.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++){
            char p = pattern.charAt(i);
            if(pmap.containsKey(p)){
                if(!pmap.get(p).equals(strArr[i])) return false;
            }
            if(smap.containsKey(strArr[i])){
                if(!smap.get(strArr[i]).equals(p)) return false;
            }
            else{
                pmap.put(p, strArr[i]);
                smap.put(strArr[i], p);
            }
        }
        return true;
    }   
}
