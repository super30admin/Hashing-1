// Time Complexity : O(n)
// Space Complexity : O(1)
    //n is the number of strings present in the array

// Your code here along with comments explaining your approach in three sentences only
    //We traverse through the characters in the strings and map each character in the source string to that of the target string.
    //When a character appears again, we verify if it is mapped correctly, if it is not we return false.
    //We switch target and source strings and repeat the same process to avoid edge case failures like abba->cccc.

import java.util.*;

class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        int n = s.length();
        for (int i=0; i<n; i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)&&map.get(a)!=b)
            {
                return false;
            }
            map.put(a, b);
        }
        map.clear();
        for (int i=0; i<n; i++)
        {
            char a = t.charAt(i);
            char b = s.charAt(i);
            if (map.containsKey(a)&&map.get(a)!=b)
            {
                return false;
            }
            map.put(a, b);
        }
        return true;
    }
}