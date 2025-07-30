import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, initially confused with word extraction and mapping.

// Your code here along with comments explaining your approach:
// 1. Split the input string `s` into words using space.
// 2. If the number of pattern characters and words don't match, return false.
// 3. Create a map from pattern char to word, and a set to track mapped words.
// 4. For each pattern char and word:
//    - If the char already exists in map, check if its value matches the current word.
//    - If not in map, check if the word is already mapped by another char (injectivity).
//    - If not, map the char to word and continue.
// 5. Return true if all match.
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(words[i])){
                    return false;// same word already assigned to another char
                }
            }
            map.put(pattern.charAt(i),words[i]);
        }
        return true;

    }
    public static void main(String[] args) {
        WordPattern sol = new WordPattern();
        System.out.println(sol.wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(sol.wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(sol.wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(sol.wordPattern("abba", "dog dog dog dog")); // false
    }
}
