// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * We use 2 char arrays of length 100 and to store mapping between string s -> t and t -> s.
 * These mappings are stored by subtracting ' ' to fit in 100 and space value is 32
 * if mapping is not matched we return false. 
 */

public class IsomorphicCharArr {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] sChars = new char[100];
        char[] tChars = new char[100];
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sChars[sChar - ' '] != 0) {
                if(sChars[sChar - ' '] != tChar) {
                    return false;
                }
            } else {
                sChars[sChar - ' '] = tChar;
            }
            if(tChars[tChar - ' '] != 0) {
                if(tChars[tChar - ' '] != sChar) {
                    return false;
                }
            } else {
                tChars[tChar - ' '] = sChar;
            }
        }
        return true;
    }
}
