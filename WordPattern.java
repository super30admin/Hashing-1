// Time Complexity : 0(N^2)
// Space Complexity : 0(N+M)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// This code validates a one-to-one mapping between pattern characters and words by storing pairs in a HashMap and verifying that no two characters share the same word
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
public boolean wordPattern(String pattern, String s) {

        Map<Character, String> hashMap = new HashMap<>();
        char[] charArray = pattern.toCharArray();
        String[] wordsArray = s.split("\\s+");

        if (charArray.length != wordsArray.length) {
            return false;
        }
        
        for (int i=0; i<charArray.length; i++) {
            if (hashMap.containsKey(charArray[i])) {
                if (!hashMap.get(charArray[i]).equals(wordsArray[i])) {
                    return false;
                }
            } else {
                if (hashMap.values().contains(wordsArray[i])) {
                    return false;
                }
                hashMap.put(charArray[i], wordsArray[i]);
            }
        }
        return true;
    }
}
