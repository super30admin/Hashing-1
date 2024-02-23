// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach in three sentences only
/*
 * Used one hash map and hashset, for all chars in pattern did a put in hashmap with char as key and value as string
 * when doing put also did a ADD IN hashSet
 * When Key is already existing did a check if the value is same
 * Before Inserting did a check in hashset if the value exists 
 */

// Java code to implement the approach

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");

        if (pattern.length() != strArr.length) {
            return false;
        }

        Map<Character, String> hmap = new HashMap<>();
        HashSet<String> hSet = new HashSet<>();
        for (int i = 0; i <= strArr.length - 1; i++) {
            char key = pattern.charAt(i);
            String strS = strArr[i];
            if (hmap.containsKey(key)) {
                if (!hmap.get(key).equals(strS)) {
                    return false;
                }
            } else {
                // if(hmap.containsValue(strS)) {
                if (hSet.contains(strS)) {
                    return false;
                } else {
                    hmap.put(key, strS);
                    hSet.add(strS);
                }
            }
        }
        return true;
    }
}
