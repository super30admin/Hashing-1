// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
/*
 * For every character as key in "s" put a value from "t"
 * in hashmap
 * If any different value found while traversing it is not 
 * isomorphic
 */

import java.util.HashMap;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        
        for(int i=0; i<s.length();i++){
            
            if(!map.containsKey(s.charAt(i))){
                if(!map.containsValue(t.charAt(i))){
                    map.put(s.charAt(i),t.charAt(i));
                }else{
                    return false;
                }
            }
            
            if(!map.get(s.charAt(i)).equals(t.charAt(i))) return false;  
        }
        return true;
    }
}
