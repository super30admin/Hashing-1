// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

class wordPatternSolution {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();

        if(pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char currCharacter = pattern.charAt(i);
            if (map.containsKey(currCharacter)) {
                if (!map.get(currCharacter).equals(words[i])){
                    return false;
                }
            }
            else {
                if (map.containsValue(words[i])) {
                    return false;
                }
                map.put(currCharacter, words[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern;
        String str;
        pattern = "abba";
        str = "dog cat cat dog";
        boolean result;
        result = wordPattern(pattern, str);
        if (result == true) {
            System.out.print("Word pattern");
        }
        else {
            System.out.print("Not a word pattern");
        }
    }

}