//Time Complexity - O(NKlogK) -- not sure
//Space Complexity - O(NK) -- not sure
/* Approach - used 2 Hashmaps to check bi directional mapping.
*/
import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                if(!tMap.containsKey(tChar)){    
                    sMap.put(sChar,tChar);
                    tMap.put(tChar,sChar);
                }else if(tMap.get(tChar)!=sChar) return false;
            }else if(sMap.get(sChar)!=tChar){
                return false; 
            }
        }
        return true;
    }
}
