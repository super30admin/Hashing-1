/*
 * Problem: Isomorphic Strings
 * Approach: Use two hash maps to track the character mappings between the two strings.
 * We used two hash maps to ensure that the mapping is consistent in both directions.
 * If we find a character in one string that has already been mapped to a different character in the other string, we return false.
 * If we successfully map all characters without conflicts, we return true.
 * 
 * * Time Complexity: O(N) where N is the length of the strings.
 * * Space Complexity: O(1) since the character set is fixed (only lowercase English letters).
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false; // If lengths are different, they cannot be isomorphic
        }

        Map<Character, Character> mapST = new HashMap<>(); // Map from characters in s to characters in t
        Map<Character, Character> mapTS = new HashMap<>(); // Map from characters in t to characters in s

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if the mapping exists in both directions
            if (mapST.containsKey(charS) && mapST.get(charS) != charT) {
                return false; // Mismatch in mapping from s to t
            }
            if (mapTS.containsKey(charT) && mapTS.get(charT) != charS) {
                return false; // Mismatch in mapping from t to s
            }

            // Create the mapping from s to t and t to s
            mapST.put(charS, charT);
            mapTS.put(charT, charS);
        }

        return true; // All characters mapped correctly
    }
}
