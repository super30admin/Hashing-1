// Solution using 2 arrays

// 1 array, 1 HashSet

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * sArr is used to map characters from s to characters from of t. tArr is used to store unique characters of t. It is used to
 * check if a character from t is already mapped to some other character from s.
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;

        char[] sArr = new char[224];
        char[] tArr = new char[224];

        for(int i=0; i<s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sArr[sChar-' '] != 0) {
                if(sArr[sChar-' '] != tChar) return false;
            }
            else {
                if(tArr[tChar-' '] != 0) return false;
                tArr[tChar-' '] = tChar;
                sArr[sChar-' '] = tChar;
            }
        }

        return true;
    }
}