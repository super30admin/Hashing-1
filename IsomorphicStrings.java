import java.util.*;

// O(n) time, O(1) space since only 26 chars
class Solution {
    public boolean isIsomorphic(String s, String t) { 
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            sMap.putIfAbsent(sChar, tChar);
            tMap.putIfAbsent(tChar, sChar);

            if ((sMap.get(sChar) != tChar) || (tMap.get(tChar) != sChar)) {
                return false;
            }
        }
        return true;
    }
}