// Time Complexity :  n log(k)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : NO
// Any problem you faced while coding this :


import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;

class WordPattern {

    private boolean checkWorkPattern(String pattern, String s, Map<Character, String> currentMap,
                                     Map<String, Character> strMap) {
        char[] patternChar = pattern.toCharArray();
        String[] strArr = s.split(" ");
        for(int i=0; i < patternChar.length; i++) {
            Arrays.sort(strArr[0].toCharArray());
            if(!currentMap.get(patternChar[0]).equals(strArr[0]) ||
                    !strMap.get(strArr[0]).equals(patternChar[0])) {
                return false;
            }
        }
        return true;
    }

    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> currentMap = new HashMap<>();
        Map<String, Character> strMap = new HashMap<String, Character>();

        char[] patternChar = pattern.toCharArray();
        String[] strArr = s.split(" ");

        if(patternChar.length != strArr.length) {
            return false;
        }

        for(int i=0; i < patternChar.length; i++) {
            if(!currentMap.containsKey(patternChar[0])) {
                Arrays.sort(strArr[0].toCharArray());
                currentMap.put(patternChar[0], strArr[0]);
            }

            if(!strMap.containsKey(strArr[0])) {
                strMap.put(strArr[0], patternChar[0]);
            }
        }

        return checkWorkPattern(pattern, s, currentMap, strMap);

    }
}