import java.util.*;

class Solution {
    /*  time complexity - O(n + m)
        SC - O(m) (m is length of s)
    */

    public boolean wordPattern(String pattern, String s) {
        int sl = pattern.length();
        // split the words at space
        String[] words = s.split("\\s+");
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> patternSet = new HashSet<>();

        if (sl != words.length) {
            return false;
        }

        for (int i = 0; i < sl; i++) {
            char c = pattern.charAt(i);
            // map each word to a character and save it to the map
            if (map.containsKey(c)) {
                // if character is mapped to a different word return false
                if (!map.get(c).equals(words[i])) return false;
            } else {
                // if map does not contain the word, but we have already seen this word before, return false
                if (patternSet.contains(words[i])) {
                    return false;
                }
                // else add the character -> word mapping to map
                map.put(c, words[i]);
                // add the new word to the set
                patternSet.add(words[i]);
            }
        }

        return true;
    }
}