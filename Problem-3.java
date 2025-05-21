//Time complexity - O(n)
// Space complexity - O(1)
// Faced any issues - No
// Solved on leetcode- yes
// need to check both the if s can be replaced by a character and get T and viceversa. So check at every individual character
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split("\\s+");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> smap = new HashMap<>();
        Map<String, Character> tmap = new HashMap<>();


        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String word = words[i];

            if (smap.containsKey(pChar)) {
                if (!smap.get(pChar).equals(word)) {
                    return false;
                }
            } else {
                smap.put(pChar, word);
            }

            if (tmap.containsKey(word)) {
                if (tmap.get(word) != pChar) {
                    return false;
                }
            } else {
                tmap.put(word, pChar);
            }
        }

        return true;
    }
}
