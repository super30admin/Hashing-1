class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i <= s.length() - 1; i++) {

            char sVal = s.charAt(i);
            char tVal = t.charAt(i);

            if(sMap.containsKey(sVal)) {
                if(sMap.get(sVal) != tVal) return false;
            } else {
                sMap.put(sVal, tVal);
            }

            if(tMap.containsKey(tVal)) {
                if(tMap.get(tVal) != sVal) return false;
            } else {
                tMap.put(tVal, sVal);
            }
        }

        return true;
    }
}