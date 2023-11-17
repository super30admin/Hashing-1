import java.util.Arrays;
//T.C O(n)
//S.C O(n)
// Did this code successfully run on Leetcode : yes (https://leetcode.com/problems/isomorphic-strings/)
// Any problem you faced while coding this : -

//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//We use two arrays to store the chars at their relative ascii index(by subtracting ASCII of SPACE).
//We iterate through the strings and For each index, We check if each string's array has the char
// corresponding to other string's
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;

        char[] sArr = new char[256];
        char[] tArr = new char[256];

        for(int i =0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sArr[sChar-' ']!=0) {
                //The value is already in the map
                if(sArr[sChar-' ']!=tChar)
                    return false;
            } else {
                if(tArr[tChar - ' ']!= 0) return false;
                tArr[tChar - ' ']= tChar;
                sArr[sChar - ' ']= tChar;
            }
        }

        return true;
    }

}
