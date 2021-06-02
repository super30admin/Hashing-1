class isomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        //Time complexity (O(n))
        //Space complexity O(1)
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char SChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!sMap.containsKey(SChar)) {
                sMap.put(SChar, tChar);
            } else {
                if (sMap.get(SChar) != tChar) {
                    return false;
                }
            }

            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, SChar);
            } else {
                if (sMap.get(tChar) != SChar) {
                    return false;
                }
            }
        }

        return true;
        
    }
}