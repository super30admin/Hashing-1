//Time Complexity - O(NKlogK) -- not sure
//Space Complexity - O(NK) -- not sure
/* Approach - used Hashmap and a hashset to check bi directional mapping.
*/
import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        if(str.length != pattern.length()) return false;
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch)){
                if(!set.contains(str[i])){
                    map.put(ch,str[i]);
                    set.add(str[i]);
                } else {
                    return false;
                }
                
            } else if(!map.get(ch).equals(str[i])) {
                return false;
            }
        }
        
        return true;     
    }
}