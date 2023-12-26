import java.util.*;
// TC: 0(N + M), where N is length of pattern and M is length of string
// SC: 0(N), where N is number of unique words in string
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");
        if (pattern.length() != sArr.length) return false;
        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String temp = sArr[i];
            if (!pMap.containsKey(pChar)) {
                if (sMap.containsKey(temp)) {
                    return false;
                }
                pMap.put(pChar, temp);
                sMap.put(temp, pChar);
            } else {
                String mappedString = pMap.get(pChar);
                if (!mappedString.equals(temp)) {
                    return false;
                }
            }
        }
        return true;
    }
}
