import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char pChar = t.charAt(i);
            if (!map.containsKey(sChar)) {
                if (set.contains(pChar))
                    return false;
                map.put(sChar, pChar);
                set.add(pChar);
            } else {
                if (map.get(sChar) != pChar)
                    return false;
            }
        }
        return true;

    }
}