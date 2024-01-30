import java.util.HashMap;
import java.util.Map;

//Time Complexity - O(n) => pattern.length
// Space Complexity - O(n) => n=length of pattern (HashMap keys)

public class WordPatternTwoMaps {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            Map<Character, String> patternToStringMap = new HashMap<>();
            Map<String, Character> stringToPatternMap = new HashMap<>();

            String[] stringArray = s.split(" ");

            if (pattern.length() != stringArray.length) {
                return false;
            }

            for (int i = 0; i < pattern.length(); i++) {
                char currChar = pattern.charAt(i);
                String currentString = stringArray[i];
                if (patternToStringMap.containsKey(currChar)) {
                    if (!patternToStringMap.get(currChar).equals(currentString)) {
                        return false;
                    }
                }
                if (stringToPatternMap.containsKey(currentString)) {
                    if (!stringToPatternMap.get(currentString).equals(currChar)) {
                        return false;
                    }
                }

                patternToStringMap.put(currChar, currentString);
                stringToPatternMap.put(currentString, currChar);
            }
            return true;
        }
    }
}
