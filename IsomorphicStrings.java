// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : coding the logic for reverse mapping


import java.util.*;
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++) {

            char currCharS = s.charAt(i);
            char currCharT = t.charAt(i);

            if(map1.containsKey(currCharS)) {
                if(map1.get(currCharS) != currCharT) {
                    return false;
                }
            } else {
                if(map2.containsKey(currCharT)) {
                    return false;
                }
                map1.put(currCharS, currCharT);
                map2.put(currCharT, currCharS);
            }
        }

        return true;
        
    }
}