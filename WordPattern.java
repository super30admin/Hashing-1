import java.util.HashMap;
import java.util.Arrays;

/**
 * The logic used here is similar to the Isomorphic Strings Problem. 
 * str: string of words (space separated) is tokenized by spaces in strArr.
 * 
 * Idea is to form a mapping from pattern to strArr and vice versa. Using a
 * HashMap to track the mappings. Start by creating mapping from pattern to
 * strArr, if there is conflict, we terminate. Similarly for other way round. If
 * everything works out well, the given str follows the pattern.
 * 
 * Space Complexity: O(M + N), M is pattern length, N is str len
 * Time Complexity: O(M+N)
 * 
 * Leetcode Result:
 * Runtime: 1 ms, faster than 99.64% of Java online submissions for Word Pattern. 
 * Memory Usage: 33.9 MB, less than 97.30% of Java online submissions for Word Pattern.
 */
public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }

    /**
     * 
     * @param pattern to be followed
     * @param str     input string
     * @return true if tokens in str follows pattern, false otherwise
     */
    public static boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split(" "); // tokenize
        // base case check
        if (pattern.length() != strArr.length) {
            return false;
        }
        // mapping character in pattern to token in str
        HashMap<Character, String> hashmapPS = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (hashmapPS.get(pattern.charAt(i)) != null) {
                if (!hashmapPS.get(pattern.charAt(i)).equals(strArr[i])) {
                    return false;
                }
            } else {
                hashmapPS.put(pattern.charAt(i), strArr[i]);
            }
        }
        // mapping token in str to character in pattern
        HashMap<String, Character> hashmapSP = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            if (hashmapSP.get(strArr[i]) != null) {
                if (hashmapSP.get(strArr[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                hashmapSP.put(strArr[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
