//Did this code successfully run on Leetcode :  Yes
//Any problem you faced while coding this :  No
//Time complexity - O(N)
//Space complexity - O(N)
import java.util.HashMap;

public class IsoMorphic_LC205 {
    public boolean isIsomorphic(String s, String t) {
        int sLen = s.length();int tLen = t.length();
        if(sLen != tLen) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i = 0; i<sLen; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else{
                sMap.put(s.charAt(i), t.charAt(i));
            }


            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            } else{
                tMap.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
