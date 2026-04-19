// Time Complexity : 0(N^2)
// Space Complexity : 0(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only

// This code determines if two strings are isomorphic by building a unique character-to-character mapping and
// verifying consistency throughout the strings. It uses a HashMap to link characters from s to t,
// while the values().contains() check ensures that no two characters from the first string map to the same character in the second.

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
     public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hashMap = new HashMap<>();
        char[] charArrayOne = s.toCharArray();
        char[] charArrayTwo = t.toCharArray();

        if (charArrayOne.length != charArrayTwo.length) {
            return false;
        }
        for (int i=0; i<charArrayOne.length; i++) {
            if (hashMap.containsKey(charArrayOne[i])) {
                if (hashMap.get(charArrayOne[i]) != charArrayTwo[i]) {
                    return false;
                }
            } else {
                if (hashMap.values().contains(charArrayTwo[i])) {
                    return false;
                }
                hashMap.put(charArrayOne[i], charArrayTwo[i]);
            }
        }
        return true;
    }
}

