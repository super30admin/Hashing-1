import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Time Complexity - O(n) => s.length()
// Space Complexity - O(n) => n=length of pattern (HashMap keys)

public class WordPatternMapSet {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            Map<Character, String> patternToStringMap = new HashMap<>();
            Set<String> stringSet = new HashSet<>();

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
                } else if (stringSet.contains(currentString)) {
                    return false;
                } else {
                    patternToStringMap.put(currChar, currentString);
                    stringSet.add(currentString);
                }
            }
            return true;
        }
    }
}
