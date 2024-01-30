import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Hashmap is used to store the S to T string  characters mapping
//hashset to track if T string chars already mapped to a different char in S
//First check if char at i index of S is already mapped to different char using hashmap, 
//  if not present in the map and the set, proceed to add/override the entry in the map and add i index char of T to set
//  if present and mapped to the expected char, proceed to next iteration
//  if none of these conditions are satisfied, it determines that duplicate char mapping has occurred so return false

class Problem2_Is_Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> smap = new HashMap<>();
        Set<Character> tset = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            Character c=smap.get(s.charAt(i));
            if((c==null && !tset.contains(t.charAt(i))) || (c!=null && c.equals(t.charAt(i)))){
                smap.put(s.charAt(i), t.charAt(i));
                tset.add(t.charAt(i));
            } else
                return false;
        }
        return true;
    }
}