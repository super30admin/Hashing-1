//Time Complexity - O(n)
//Space Complexity - O(n)
/*Approach - A HashMap is used to store mappings from characters in the first string (s) to characters in the second string (t).
A hashet is used to store the mapped values for faster lookup and verification.*/

import java.util.HashMap;
import java.util.HashSet;

class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() == 0 || t.length() == 0 || (s.length() != t.length())) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        // Iterate through each character in the strings
        for (int i = 0; i < s.length(); i++) {
            // Check if the character in the first string is already mapped
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                // Check if the current character in the second string is already mapped
                if (set.contains(t.charAt(i))) {
                    return false;
                }

                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        }

        return true;
    }

}