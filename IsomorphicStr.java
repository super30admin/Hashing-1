//Time Complexity : O(n)
// Space Complexity : O(1)
// Challenges : None
// Does it run on Leet Code? : Yes

// This is hashset, hashmap solution. Both are hashing functions based.
// If character is already being mapped to something else before and available in Set and not there in Map then it is wrong.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStr {

    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;

        Map<Character, Character> sMap = new HashMap<>();
        Set<Character> tSet = new HashSet<>();

        for(int i=0; i< s.length(); i++) {       

            if(sMap.containsKey(s.charAt(i))){
               if(sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }   
            } else {
                if(tSet.contains(t.charAt(i))){
                    return false;
                }
                tSet.add(t.charAt(i));
                sMap.put(s.charAt(i), t.charAt(i));
                
            }
        }
        return true;
    }
    
}
