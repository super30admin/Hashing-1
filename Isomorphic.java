// Time Complexity o(n) Space Complexity o(1)

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            char c = t.charAt(i);
            if (smap.containsKey(p)) {
                if (smap.get(p) != c)
                    return false;
            } else {
                if (tset.contains(c))
                    return false;
                else {
                    smap.put(p, c);
                    tset.add(c);
                }
            }
        }
        
        return true;
    }
}
