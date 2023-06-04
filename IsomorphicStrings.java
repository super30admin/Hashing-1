// Time Complexity : O(n) where n is the length of the input strings s and t, as we iterate over the entire string once
// Space Complexity : O(2*n) --> O(n) where n is the length of the input strings s and t as we need to create an entry for each char in the HashMaps
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
import java.util.HashMap;
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        if(s == null || t == null || s.length() != t.length()){
            return false;
        }
        if(s.length() == 0){
            return true;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character sKey = s.charAt(i);
            Character tKey = t.charAt(i);

            if(!sMap.containsKey(sKey)){
                sMap.put(sKey, tKey);
                if(! tMap.containsKey(tKey)){
                    tMap.put(tKey, sKey);
                }
            }
            if(sMap.get(sKey) != tKey || tMap.get(tKey) != sKey){
                return false;
            }
        }
        return true;
    }
}