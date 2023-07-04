// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



import java.util.HashMap;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" "); // Split the string s into an array of words

        if (pattern.length() != words.length) {
            return false; // If the pattern and words have different lengths, they cannot follow the same pattern
        }

        HashMap<Character, String> map = new HashMap<>(); // Map to store the mapping between characters in pattern and words

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                // If the character is already mapped but to a different word, return false
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                // If the word is already mapped to a different character, return false
                if (map.containsValue(word)) {
                    return false;
                }

                map.put(ch, word); // Add the mapping between character and word to the map
            }
        }

        return true;
    }
}
