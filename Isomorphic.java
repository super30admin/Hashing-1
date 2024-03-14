// TC = O(n) 
// SC = O(n) 
;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s == null) return false;
        
        char[] sMap = new char[256];
        char[] tMap = new char[256];

        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            if (sMap[schar - ' '] != 0) {
                if (sMap[schar - ' '] != tchar) return false;
            } else {
                sMap[schar - ' '] = tchar;
            }
            if (tMap[tchar - ' '] != 0) {
                if(tMap[tchar - ' '] != schar) return false;
            } else {
                tMap[tchar - ' '] = schar;
            }
        }

        return true;
    }
}
