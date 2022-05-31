
// Time Complexity : O(N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : coming up with the optimal solution was the hurdle

// Your code here along with comments explaining your approach
public class Isomorphic {

    // ASCII characters -> array of size 256
    int[] c1 = new int[256];
    int[] c2 = new int[256];

    public boolean isIsomorphic(String s, String t) {

        for (int i = 0; i < s.length(); i++) {

            // Getting Chars from both the Strings
            char a = s.charAt(i);
            char b = t.charAt(i);

            // Comparing them
            if (c1[a] != c2[b]) return false;

            // Assigning values as Index + 1 to avoid collision with 0.
            c1[a] = i + 1;
            c2[b] = i + 1;

        }

        return true;
    }
}
