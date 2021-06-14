import java.util.HashMap;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        //Time complexity (O(n))
        //Space complexity O(1)
        if (s.length() != t.length()) return false;
        //Number of ASCII values including all characters stays constant
        char[] sMap = new char[256];
        char[] tMap = new char[256];

        for (int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap[sChar - ' '] == 0) {
                sMap[sChar - ' '] = tChar;
            } else {
                if (sMap[sChar - ' '] != tChar) {
                    return false;
                }
            }

            //Space is the first character like we minus a for just letters
            if (tMap[tChar - ' '] == 0) {
                tMap[tChar - ' '] = sChar;
            } else {
                if (tMap[tChar - ' '] != sChar) {
                    return false;
                }
            }
        }

        return true;

    }
}