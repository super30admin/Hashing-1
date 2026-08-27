//Time Complexity : O(n)
//Space Complexity : O(1)

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        char[] sMap = new char[100];
        char[] tMap = new char[100];
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap[sChar - ' '] != 0) {
                if(tChar != sMap[sChar - ' ']) return false;
            } else {
                sMap[sChar - ' '] = tChar;
            }

            if(tMap[tChar - ' '] != 0) {
                if(sChar != tMap[tChar - ' ']) return false;
            } else {
                tMap[tChar - ' '] = sChar;
            }
        }
        return true;
    }
}
