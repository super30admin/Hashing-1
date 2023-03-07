/*this implementation uses Hashmap to store the pattern
* the time complexity of this implementation is O(n) where n is length of the string*/
import java.util.HashMap;
import java.util.Map;

public class Patternproblem {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(c, word);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        Patternproblem solution = new Patternproblem();
        boolean result1 = solution.wordPattern(pattern1, s1);
        System.out.println(result1);  // Output: true

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        boolean result2 = solution.wordPattern(pattern2, s2);
        System.out.println(result2);  // Output: false

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        boolean result3 = solution.wordPattern(pattern3, s3);
        System.out.println(result3);  // Output: false

        String pattern4 = "abba";
        String s4 = "dog dog dog dog";
        boolean result4 = solution.wordPattern(pattern4, s4);
        System.out.println(result4);  // Output: false
    }
}
