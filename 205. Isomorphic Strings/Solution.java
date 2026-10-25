class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (smap.containsKey(sChar)) {
                if (tChar != smap.get(sChar)) {
                    return false;
                }
            } else {
                smap.put(sChar, tChar);
            }

            if (tmap.containsKey(tChar)) {
                if (sChar != tmap.get(tChar)) {
                    return false;
                }
                tmap.put(tChar, sChar);
            } else {
                tmap.put(tChar, sChar);
            }
        }
        return true;
    }
}

// TC - O(n) // for loop
// SC - O(1) // 26 char