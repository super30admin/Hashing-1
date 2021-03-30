// Time Complexity :O(N)
// Space Complexity :O(M)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here  with comments explaining your approach

class Solution {

    public boolean isIsomorphic(String s, String t) {
        // Create 2 arrays and match the count with each other
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char scurr = s.charAt(i);
            char tcurr = t.charAt(i);
            if (arr1[scurr] != arr2[tcurr])
                return false;
            arr1[scurr] = i + 1;
            arr2[tcurr] = i + 1;
        }
        return true;
    }

}