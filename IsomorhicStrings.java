/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * <p>
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * <p>
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 */

/*
Approach: Here we have to check the character mapping both ways.
Using hashmap to keep counter for each new character, generating the pattern with numbers for both strings.
If both string pattern matches then strings are isomorphic else not isomorphic.

The reason behind generating pattern for both strings is that we have to verify 2 way relationship.

Time complexity: o(n) where n is length of string( s or t)
Space complexity:o(n) because we are generating patterns for both string which will be 2n. We can discard the constant so its o(n).
*/
public class IsomorphicStrings {

    /**
     * check whether two strings are isomorphic or not.
     *
     * @param s first string
     * @param t second string
     * @return true if s and t are isomorphic, else return false
     */
    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;
        return generatePattern(s).equals(generatePattern(t));
    }

    /**
     * Helper method to create pattern of string. eg input ="egg"->011, lmn->012
     *
     * @param s input string
     * @return pattern string
     */
    private static String generatePattern(String s) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, count++);
            }
            sb.append(map.get(ch));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));
        System.out.println(isIsomorphic("foo", "bar"));
    }
}