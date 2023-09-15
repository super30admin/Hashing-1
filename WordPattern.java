// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] sParts = s.split(" ");
        if (pattern.length() != sParts.length) {
            return false;
        }
        char[] charPattern = pattern.toCharArray();
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> stringMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!patternMap.containsKey(charPattern[i])) {
                if (!stringMap.containsKey(sParts[i])) {
                    patternMap.put(charPattern[i], sParts[i]);
                    stringMap.put(sParts[i], charPattern[i]);
                } else {
                    return false;
                }
            } else {
                if (!stringMap.containsKey(sParts[i])) {
                    return false;
                } else {
                    if ((charPattern[i] != stringMap.get(sParts[i])) ||
                            (!sParts[i].equals(patternMap.get(charPattern[i])))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
