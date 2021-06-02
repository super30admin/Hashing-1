class wordPattern {
    public boolean wordPattern(String s, String words) {

        //Time complexity (O(n))
        //Space complexity O(1)
        String[] t = t.split(" ");
        if (s.length() != t.length) return false;
        HashMap<Character, String> sMap = new HashMap<>();
        HashMap<String, Character> tMap = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char SChar = s.charAt(i);
            String tChar = t[i];

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