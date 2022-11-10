// Time Complexity : o(N)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

//https://leetcode.com/problems/isomorphic-strings/

//rather using the traditional approach by using hashmaps, 
// I used the ascii values of the letters as the indices, and the first 256 indices represent the 
// letters from first string, while the rest represent the letters from the second strings, 
//and then compared their existance
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // base condition
        if (s.length() == 1)
            return true;
        int[] checker = new int[512];
        // Arrays.fill(checker,-1);
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (checker[cs] == 0 && checker[ct + 256] == 0) {
                checker[cs] = ct + 0;
                checker[ct + 256] = cs + 0;
            } else if (!(checker[cs] == (ct + 0) && checker[ct + 256] == (cs + 0)))
                return false;

        }
        return true;
    }
}