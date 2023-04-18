// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * we use 1 hashmap to store s -> t mapping and 1 hashset to store t -> s character mappings and return false if the 
 * char does not match
 */
import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicSet {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)) {
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if(set.contains(tChar)) {
                    return false;
                } else {
                    sMap.put(sChar, tChar);
                    set.add(tChar);
                }              
            }
        }
        return true;
    }
}
