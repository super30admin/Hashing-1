// Time Complexity : O(n) where n is the length of the input strings
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


import java.util.*;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        // Create a HashMap to store the mapping between ascii value of characters of s and t
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the characters of s and t
        for(int i = 0; i < s.length(); i++)
        {
            // Get the ASCII values of the characters at position i in s and t
            int ascii1 = (int) s.charAt(i);
            int ascii2 = (int) t.charAt(i);

            // If the ascii value of character in s is already mapped to a different ascii value of character in t, then the mapping is not isomorphic, so return false
            if(map.containsKey(ascii1))
            {

                if(map.get(ascii1) != ascii2)
                {
                    return false;
                }

            }


            // If the ascii value of character in s is not mapped yet, but the ascii value of character in t is already mapped to another ascii value of character in s, then the mapping is not isomorphic, so return false
            else
            {
                if(map.containsValue(ascii2))
                {
                    return false;
                }
            }

            // Add the mapping between the ascii value of characters of s and t to the HashMap
            map.put(ascii1, ascii2);

        }

        // All ascii values of characters in s and t have been mapped uniquely, so return true
        return true;

    }
}