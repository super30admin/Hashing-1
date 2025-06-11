// Time Complexity : O(n), where n is the length of the strings
// Space Complexity : O(1), since HashMaps in this problem store 26 characters at most
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// We use a character array `sMap` to store mappings from characters of s to t.
// A boolean array `hset` ensures no two characters from s map to the same character in t.
// If the character in `sMap` already maps to a different one, or `tchar` is reused, we return false.
// Otherwise, we store the mapping and mark `tchar` as used.
// If the entire loop completes without conflict, the strings are isomorphic.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sMap = new char[256];
        boolean[] hset = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            //Check is the character is present in the array
            if(sMap[schar - ' '] != 0){
                //Check if the value is same
                if(sMap[schar - ' '] != tchar) {
                    //Return false if not same
                    return false;
                }
                //If the character is not present in the array, check if its in hashset boolean
            }else{
                if(hset[tchar - ' ']){
                    return false;
                }
                //else put it in the array and its value as true in hset boolean
                sMap[schar - ' '] = tchar;
                hset[tchar - ' '] = true;
            }
        }
        //If no breach return true
        return true;
    }
}