class Solution2 {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] smap = new char[256];
        char[] tmap = new char[256];

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (smap[sChar - ' '] != 0) {
                if (tChar != smap[sChar - ' '])
                    return false;

            } else {
                smap[sChar - ' '] = tChar;
            }

            if (tmap[tChar - ' '] != 0) {
                if (sChar != tmap[tChar - ' '])
                    return false;

            } else {
                tmap[tChar - ' '] = sChar;
            }
        }
        return true;
    }
}

// TC - O(n) // for loop
// SC - O(1) // 26 char