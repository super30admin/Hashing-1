import java.util.HashSet;
import java.util.Set;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


//uses an integer array charMap to track the mapping from characters in s to
//characters in t. Iterates through the strings, updating the mapping,
//and returns false if the mapping is inconsistent. The function returns true if the strings are isomorphic.

public class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength != tLength) {
            return false;
        }

        Set<Character> setArr = new HashSet<Character>();
        char[] charMap = new char[256];

        for (int i = 0; i < sLength; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (!(charMap[charS - ' '] == 0)) {
                if (charT != charMap[charS - ' ']) {
                    return false;
                }
            } else {
                if (!setArr.add(charT)) {
                    return false;
                }
                charMap[charS - ' '] = charT;
            }
        }

        return true;
    }
}
