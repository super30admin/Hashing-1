package s30;

import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        
        Map<Character, String> charToStr = new HashMap<>();
        Map<String, Character> strToChar = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            
            if (!charToStr.containsKey(ch) && !strToChar.containsKey(word)) {
                charToStr.put(ch, word);
                strToChar.put(word, ch);
            } else {
                if (!word.equals(charToStr.get(ch)) || strToChar.get(word) != ch) {
                    return false;
                }
            }
        }
        
        return true;
    }
    

}
