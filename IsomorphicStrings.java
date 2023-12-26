import java.util.*;
// TC: 0(N), where N is length of string
// SC: 0(1), since there can be at most 26 chars
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!sMap.containsKey(sChar)) {
                if (tMap.containsKey(tChar)) {
                    return false;
                }
                sMap.put(sChar, tChar);
                tMap.put(tChar, sChar);
            } else {
                char mappedChar = sMap.get(sChar);
                if (mappedChar != tChar) {
                    return false;
                }
            }
        }
        return true;
    }
}
