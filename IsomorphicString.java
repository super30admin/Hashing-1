// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> s_map = new HashMap<>();
        Map<Character, Character> t_map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            if(!s_map.containsKey(s_char)){
                s_map.put(s_char, t_char);
            }
            else{
                if(s_map.get(s_char) != t_char){
                    return false;
                }
            }
            if(!t_map.containsKey(t_char)){
                t_map.put(t_char, s_char);
            }
            else{
                if(t_map.get(t_char) != s_char){
                    return false;
                }
            }
        }
        return true;
    }
}
