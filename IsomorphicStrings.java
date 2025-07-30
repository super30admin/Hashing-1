// Time Complexity: O(n), where n is the length of the strings s and t
// Space Complexity: O(1), since the hash map will contain at most 256 character mappings
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: Initially confusing how to prevent two characters mapping to the same character in t

// Your code here along with comments explaining your approach:
// The idea is to check if characters in string s can be mapped uniquely to characters in string t.
// If a character in s is already mapped to a different character in t, return false.
// Also ensure that two characters from s do not map to the same character in t.

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        // HashMap to store mapping from characters in s to characters in t
        HashMap<Character, Character> sChar = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);  // character from s
            char tc = t.charAt(i);  // character from t

            // If current character in s already has a mapping
            if(sChar.containsKey(sc)) {
                // Check if it maps to the correct character in t
                if(sChar.get(sc) != tc) {
                    return false;  // Conflict in mapping
                }
            }
            // If this is the first time seeing sc, make sure tc is not already mapped from another character
            else if(sChar.containsValue(tc)) {
                return false;  // Another character already maps to tc, which violates one-to-one rule
            }

            // Add the mapping from sc to tc
            sChar.put(sc, tc);
        }

        return true;  // All characters mapped correctly
    }
    public static void main(String[] args) {
        IsomorphicStrings sol = new IsomorphicStrings();

        // Test cases
        String s1 = "egg", t1 = "add";    // true
        String s2 = "foo", t2 = "bar";    // false
        String s3 = "paper", t3 = "title"; // true
        String s4 = "badc", t4 = "baba";   // false

        System.out.println(sol.isIsomorphic(s1, t1)); // true
        System.out.println(sol.isIsomorphic(s2, t2)); // false
        System.out.println(sol.isIsomorphic(s3, t3)); // true
        System.out.println(sol.isIsomorphic(s4, t4)); // false
    }
}
