// Time Complexity : O(n)
// Space Complexity : O(m)
// Split the input string str into an array of words.
// Create two hash maps: one for mapping characters to words (patternMap), and the other for mapping words to characters (wordMap).
// Iterate through each character in the pattern and its corresponding word in the words array. Check if the mappings in both directions are consistent. If not, return false.
// If the loop completes without returning false, then the pattern and string follow the same pattern, and the function returns true.


import java.util.HashMap;

public class PatternMatching {
    public static boolean wordPattern(String pattern, String str) {
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
        System.out.println(wordPattern("abba", "dog cat cat dog")); // Output: true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // Output: false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // Output: false
        System.out.println(wordPattern("abba", "dog dog dog dog")); // Output: false
    }
}
