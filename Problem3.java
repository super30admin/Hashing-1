import java.util.*;

// Time Complexity : O(n)
// Space Complexity : O(M) where m is no of unique strings in s
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


public class Problem3 {
    class Solution {

        // In this solution, I'm maintaining 2 maps- patternMap and inputMap. Each of these map represents the map of its elements to the element in the other map.
        // Then we traverse through the String s. For each char in s, we check if it in patternMap. If not, it meaning it's been looked for the first time so we add the mapping in patternMap.
        // If it is available then we check if the mapping is as expected, if not we return false
        // Similarly we check for inputMap.
        public boolean wordPattern(String pattern, String s) {
            String[] strs = s.split(" ");
            Map<Character, String> patternMap = new HashMap<>();
            Map<String, Character> inputMap = new HashMap<>();

            if (strs.length != pattern.length()) return false;

            for (int i = 0; i < pattern.length(); i++) {
                if (!patternMap.containsKey(pattern.charAt(i))) {
                    patternMap.put(pattern.charAt(i), strs[i]);
                } else {
                    if(!patternMap.get(pattern.charAt(i)).equals(strs[i])) {
                        return false;
                    }
                }

                if (!inputMap.containsKey(strs[i])) {
                    inputMap.put( strs[i], pattern.charAt(i));
                } else {
                    if(inputMap.get(strs[i]) != pattern.charAt(i)) {
                        return false;
                    }
                }

            }

            return true;
        }
    }
}
