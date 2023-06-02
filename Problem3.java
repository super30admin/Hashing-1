package Hashing_Problems;

import java.util.HashMap;
/*
 * We check if there is a one to one mapping of elements by storing {s1 : t1} from source to target 
 * in a map. Also we use a second hashmap to map element from target to source to check for one to one mapping.
 * 
 * Time Complexity :
 * O(n) ie no of characters in src or no of words in target
 * 
 * Space Complexity :
 * Space complexity is O(1) as no of characters are constant and only one to one mapping can exist
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 * 
 */

public class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> Smap= new HashMap<>();
        HashMap<String, Character> Tmap= new HashMap<>();
        if(pattern==null || s==null)
            return false;
        else if(pattern.length()!=s.split(" ").length)
            return false;

        for(int i=0;i<pattern.length();i++){
            Character character= pattern.charAt(i);
            String word= s.split(" ")[i];
            if(Smap.containsKey(character) && !Smap.get(character).equals(word)){
                return false;
            }
            else
                Smap.put(character, word);
            
            if(Tmap.containsKey(word) && !Tmap.get(word).equals(character))
                return false;
            else
                Tmap.put(word,character);
        }

        return true;
    }

}
