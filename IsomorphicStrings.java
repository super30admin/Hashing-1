import java.util.HashMap;
import java.util.Map;


// Time Complexity : O(n)
// Space Complexity : O(26)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No

// Your code here along with comments explaining your approach in three sentences only

/**
 * Map each character in String s to the corresponding character in String t.
 * Maintain two maps for both strings. If at any point while iterating,
 * we find difference, return false. If not, return true at the end.
 */

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            } else {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            }

            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, sChar);
            } else {
                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            }
        }

        return true;

    }
}
