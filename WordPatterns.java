// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes
// Any problem you faced while coding this : No


//Approach 1)- You can do  using 2 hashMaps to keep pattern as key and s as value in first hashMap and
// use string as key and pattern as value in second hashMap.  Compare both and return true if matches otherwise false
// Approach 2) you can do it using HashMap to keep pattern as key and s as value and in hashSet storing values.
//do a lookup and return the result

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPatterns {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.containsKey(c)) {
                charToWord.put(c, word);
            }

            if (!wordToChar.containsKey(word)) {
                wordToChar.put(word, c);
            }

            if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean wordPatternUsingSet(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Set<String> wordsSet = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(c)) {
                if(!charToWord.get(c).equals(word)) return false;
            }else{
                if(wordsSet.contains(word)) return false;
                charToWord.put(c, word);
                wordsSet.add(word);
            }

        }

        return true;
    }
}
