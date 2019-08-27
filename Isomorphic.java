import java.util.HashMap;

/**
 * Given two strings s and t, determine if they are isomorphic. Two strings are
 * isomorphic if the characters in s can be replaced to get t. All occurrences
 * of a character must be replaced with another character while preserving the
 * order of characters. No two characters may map to the same character but a
 * character may map to itself.
 * 
 * Idea is to form a mapping from s to t and vice versa. Using a HashMap to
 * track the mappings. Start by creating mapping from s to t, if there is
 * conflict, we terminate. Similarly for other way round. If everything works
 * out well, the strings s and t are isomorphic.
 * 
 * Space Complexity: O(M + N), where M and N are lengths of string s and t
 * respectively. Time Complexity: O(M + N)
 * 
 * Runtime: 11 ms, faster than 42.82% of Java online submissions for Isomorphic Strings.
 * Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Isomorphic Strings.
 * 
 * Another approach with same tc but better performance would be to use a
 * character array to preserve mappings. Overhead of computing hashes is reduced.
 */
public class Isomorphic {
    /**
     * 
     * @param s
     * @param t
     * @return true if s and t are isomorphic, false otherwise.
     */
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashmapST = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashmapST.get(s.charAt(i)) != null) {
                if (hashmapST.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                hashmapST.put(s.charAt(i), t.charAt(i));
            }
        }
        HashMap<Character, Character> hashmapTS = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (hashmapTS.get(t.charAt(i)) != null) {
                if (hashmapTS.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                hashmapTS.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
