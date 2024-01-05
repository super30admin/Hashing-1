// Time Complexity :  O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//   two HashMaps (patternMap and wordMap) to store mappings between
//   characters and words, and between words and characters
import java.util.HashMap;

public class problem3 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (patternMap.containsKey(ch)) {
                if (!patternMap.get(ch).equals(word)) {
                    return false;
                }
            } else {
                patternMap.put(ch, word);
            }

            if (wordMap.containsKey(word)) {
                if (wordMap.get(word) != ch) {
                    return false;
                }
            } else {
                wordMap.put(word, ch);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        problem3 patternMatching = new problem3();

        String pattern1 = "abba";
        String str1 = "dog cat cat dog";
        System.out.println(patternMatching.wordPattern(pattern1, str1)); // Output: true

        String pattern2 = "abba";
        String str2 = "dog cat cat fish";
        System.out.println(patternMatching.wordPattern(pattern2, str2)); // Output: false

        String pattern3 = "aaaa";
        String str3 = "dog cat cat dog";
        System.out.println(patternMatching.wordPattern(pattern3, str3)); // Output: false

        String pattern4 = "abba";
        String str4 = "dog dog dog dog";
        System.out.println(patternMatching.wordPattern(pattern4, str4)); // Output: false
    }
}
