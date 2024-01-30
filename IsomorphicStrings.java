// Time Complexity :  n log(k)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :


import java.util.HashMap;
import java.util.Map;

class IsomorphicStrings {

    private boolean checkStringIsIsomarphic(String s, String t, Map<Character, Character> map) {

        for(int i=0; i<s.length(); i++) {
            if(map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for(int i=0; i < s.length(); i++) {
            if(!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), t.charAt(i));
            }

            if(!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), s.charAt(i));
            }
        }

        return checkStringIsIsomarphic(s, t, sMap) && checkStringIsIsomarphic(t, s, tMap);

    }
}
