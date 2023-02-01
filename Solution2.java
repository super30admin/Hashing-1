// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/* I have taken two arrays of size 256. I iterate through both strings and check if for position s.charAt(i)-' ', the value present is t.charAt(i)-' ' in the first array and similarly for the second
array if for position t.charAt(i)-' ' the value present is s.charAt(i). If so, I return true since both strings are isomorphic */

class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int []arr1 = new int[256];
        int []arr2 = new int[256];

        for(int i=0;i<s.length();i++)
        {
            if(arr1[s.charAt(i)-' ']!=0)
            {
                if(arr1[s.charAt(i)-' ']!=t.charAt(i)-' ')
                {
                    return false;
                }
            }
            else
            {
                arr1[s.charAt(i)-' ']=t.charAt(i)-' ';
            }
             if(arr2[t.charAt(i)-' ']!=0)
            {
                if(arr2[t.charAt(i)-' ']!=s.charAt(i)-' ')
                {
                    return false;
                }
            }
            else
            {
                arr2[t.charAt(i)-' ']=s.charAt(i)-' ';
            }
        }
        return true;
    }
}