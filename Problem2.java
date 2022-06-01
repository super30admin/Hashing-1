import java.util.*;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem2 {
    class Solution {

        // In this solution, I'm maintaining 2 maps- SMAp and tMap. Each of these map represents the map of its elements to the element in the other map.
        // Then we traverse through the String s. For each char in s, we check if it in sMap. If not, it meaning it's been looked for the first time so we add the mapping in sMap.
        // If it is available then we check if the maping is as expected, if not we return false
        // Similarly we check for tMap.
        public boolean isIsomorphic(String s, String t) {

            if (s.length() != t.length()) return false;

            Map<Character, Character> sMap = new HashMap<>();
            Map<Character, Character> tMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                if (!sMap.containsKey(s.charAt(i))) {
                    sMap.put(s.charAt(i), t.charAt(i));
                } else {
                    if(sMap.get(s.charAt(i)) != t.charAt(i)) {
                        return false;
                    }
                }

                if (!tMap.containsKey(t.charAt(i))) {
                    tMap.put(t.charAt(i), s.charAt(i));
                } else {
                    if(tMap.get(t.charAt(i)) != s.charAt(i)) {
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
