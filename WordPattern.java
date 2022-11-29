
/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * Example 1:
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 *
 * Example 2:
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 *
 * Example 3:
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 *
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
 */

/*
Approach:Will have to keep in mind that we have to maintain 2 way relation.
using 2 hashmaps to maintain both way relation.

Time complexity:o(n) where n is pattern length or number of words in str.
We are visiting every character in pattern and every word in string if number of characters in pattern is equal to number of words in str
Therefore time complexity=o(n+m)=>o(n+n)=>o(2n)=>o(n)

Space complexity:o(1) as there will be contant number of entries in the hashmap(eg. 26 characters)
 */
public class WordPattern {

    /**
     * @param pattern Pattern string
     * @param str String with multiple words seperated by space
     * @return true if str follows pattern else return false
     */

    public static boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null || s.length() == 0 || pattern.length() == 0)
            return false;

        char[] chars = pattern.toCharArray();
        String[] strings = s.split("\\s");

        if (chars.length != strings.length)
            return false;

        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> stringMap = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            //check if entry exist in the pattern map
            if (!patternMap.containsKey(chars[i])) {
                patternMap.put(chars[i], strings[i]);

            } else {
                if (!patternMap.get(chars[i]).equals(strings[i])) {
                    return false;
                }
            }

            if (!stringMap.containsKey(strings[i])) {
                stringMap.put(strings[i], chars[i]);

            } else {
                if (!stringMap.get(strings[i]).equals(chars[i])) {
                    return false;
                }
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String pattern = "abba", str = "dog cat cat dog";
        System.out.println( wordPattern(pattern,str));
        System.out.println( wordPattern("abba","dog cat cat fish"));
    }
}