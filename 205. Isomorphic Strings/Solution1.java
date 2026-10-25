class Solution1 {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (smap.containsKey(sChar)) {
                if (tChar != smap.get(sChar)) {
                    return false;
                }
            } else {
                if (tset.contains(tChar))
                    return false;
                tset.add(tChar);
                smap.put(sChar, tChar);
            }

        }
        return true;
    }
}

// TC - O(n) // for loop
// SC - O(1) // 26 char