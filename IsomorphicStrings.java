   // Time Complexity :o (N) where N is a string length
    // Space Complexity : o(1)
    // Did this code successfully run on Leetcode :Yes
    // Any problem you faced while coding this :No

    //Main Idea: Have to map each character of s with each character of t and reverse should be same.
    // In order to check whether same character is alreday happened or not and if it has happened before it is mapped to what character, hashing DS will be good for this.
class IsomorphicStrings. {
 
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //if smap already has a mapping for sChar check if its the same as tchar
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar)
                    return false;

            } else {
                sMap.put(sChar, tChar);

            }
             //if tmap already has a mapping for tChar check if its the same as schar
            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar)
                    return false;

            } else {
                tMap.put(tChar, sChar);

            }
        }

        return true;
    }
}