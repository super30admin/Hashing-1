import java.util.*;

// O(n) time, O(n) space 

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] parts = s.split(" ");

        if (parts.length != pattern.length()) return false;

        Map<Character, String> charMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = parts[i];

            charMap.putIfAbsent(c, word);
            wordMap.putIfAbsent(word, c);

            if ((!charMap.get(c).equals(word)) || (!wordMap.get(word).equals(c))) {
                return false;
            }
        }
        return true;
    }  
}
