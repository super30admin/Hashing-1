// Time Complexity : Internally using different string functions such as 1.) Splitting string which O(length of string) 2.) Converting to char arr 3.) Iterating through char arr;
// Summing up around thrice O(n) ~ O(n); Other hashmap operations are in constant O(1) TC
// Space Complexity : Storing values in map; twice O(n) ~ O(n). Here using Hashmap to store the keys extra only; the values are already exising string. Keys if all are unique then the worst case is O(n)
// Did this code successfully run on Leetcode : Yes; (https://leetcode.com/submissions/detail/637174938/)
// Any problem you faced while coding this : No;
// My Notes : Check bidirecitonal normal and reverse; if any chnage then return
import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        // Converting to char arr - T.C O(length of pattern)
        char[] charArr = pattern.toCharArray();
        // splitting string - T.C O(length of string)
        String[] splitWords = s.split("\\s+");
        if (charArr.length != splitWords.length) {
            System.out.println(" Length matach failed");
            return false;
        } else {
            // splitting string - T.C O(length of pattern)
            for (int i = 0; i < charArr.length; i++) {
                char charPattern = charArr[i];
                String word = splitWords[i];
                System.out.println(" char , word : " + charPattern + "," + word);
                if (map1.containsKey(charPattern)) {
                    // Check if equal
                    if (!map1.get(charPattern).equals(word)) {
                        System.out.println(" Map 1 failed "+map1.get(charPattern) +","+charPattern+","+word);
                        return false;
                    }
                } else {
                    // insert
                    map1.put(charPattern, word);
                }
                // Check reverse
                if (map2.containsKey(word)) {
                    // Check if equal
                    if (map2.get(word) != charPattern) {
                        System.out.println(" Map 2 failed");
                        return false;
                    }
                } else {
                    // insert
                    map2.put(word, charPattern);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hey there");
        WordPattern obj = new WordPattern();
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(obj.wordPattern(pattern, s));
    }
}
