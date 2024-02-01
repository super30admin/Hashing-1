import java.util.HashMap;
import java.util.Map;


// Time Complexity : O(n), where n is the len(pattern)
// Space Complexity : O(26)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No

// Your code here along with comments explaining your approach in three sentences only

/** Similar approach to find isomorphic strings
 *
 * Split the 's' on the space. The len(pattern) and len(strs) should be same.
 * Map each character in char in pattern to the corresponding string in String[] strs.
 * Maintain two maps for both. If at any point while iterating,
 * we find difference, return false. If not, return true at the end.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ", 0);
        if(pattern.length() != strs.length) return false;

        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();

        for(int i=0; i<pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String str = strs[i];


            if(!pMap.containsKey(pChar)) {
                pMap.put(pChar, str);
            } else {
                if(!pMap.get(pChar).equals(str) ) {
                    return false;
                }
            }


            if(!sMap.containsKey(str)) {
                sMap.put(str, pChar);
            } else {
                if(sMap.get(str) != pChar) {
                    return false;
                }
            }
        }

        return true;
    }
}
