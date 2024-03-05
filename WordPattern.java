import java.util.HashMap;
public class WordPattern {
    /*
        // Time Complexity = O(n)
        // Space Complexity = O(1)
    
    * */
        public static boolean wordPattern(String pattern, String s) {
            if(s == null || pattern == null) return false;
    
            if(pattern.length() != s.split(" ").length) return false;
    
            String[] wordArray = s.split(" ");
    
            Map<String, Character> wordMap = new HashMap<>();
            Map<Character, String> patternMap = new HashMap<>();
    
            for(int i = 0; i < pattern.length(); i++){
    
                String word = wordArray[i];
                char pChar = pattern.charAt(i);
    
                if(wordMap.containsKey(word)){
                    if(wordMap.get(word) != pChar) return false;
                } else {
                    wordMap.put(word, pChar);
                }
    
                if(patternMap.containsKey(pChar)){
                    if(!patternMap.get(pChar).equals(word)) return false;
                } else {
                    patternMap.put(pChar, word);
                }
    
            }
            return true;
        }
    }