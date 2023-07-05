// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/**
 * 1. Create a map to store the mapping of s to t.
 * 2. Create a set to store the values of s.
 * 3. If the current character of s is already present in map, check if the value is same as t.
 * 4. If not, return false.
 * 5. If the current character of s is not present in map, check if the value of t is already present in set.
 * 6. If yes, return false.
 * 7. Else, add the mapping of s to t in map and add t to set.
 * 8. Return true.
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(t.length() != s.length())
            return false;

        int len = s.length();
        char[] smap = new char[256];
        int[] set = new int[256];

        for(int i=0; i<len; i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            if(smap[schar - ' '] != 0){
                if(smap[schar - ' '] != tchar){
                    return false;
                }
            }else{
                if(set[tchar - ' '] == 1){
                    return false;
                }else{
                    smap[schar - ' '] = tchar;
                    set[tchar - ' '] = 1;
                }
            }
        }

        return true;
    }
}