import java.util.HashMap;
import java.util.HashSet;

class Solution {
    /*  time complexity - O(n)
        SC - O(1)
    */
    public boolean isIsomorphic(String s, String t) {
        int sl = s.length();
        // to store character s -> character t mapping
        HashMap<Character, Character> smap = new HashMap<>();
        // to keep tarck of characters from t we have seen
        HashSet<Character> tset = new HashSet<>();

        for (int i = 0; i < sl; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (smap.containsKey(sChar)) {
                // if map contains s character but the value does not match corresponding 
                // character from t, return false
                if (smap.get(sChar) != tChar) return false;
            } else {
                // is we have already seen the char from t, return false
                if (tset.contains(tChar)) {
                    return false;
                }
                // else add the mapping
                smap.put(sChar, tChar);
                // add the new character from t to set
                tset.add(tChar);
            }
        }

        return true;
    }
}