// Time Complexity : O(n) - where n is the length of string pattern
// Space Complexity : O(w) - w is words in the string s
// -> hashmap and hashset both uses constant space to store the characters.

// Did this code successfully run on Leetcode : Yes, faced use with ==.  To resolve this, I have used .equals()
// Any problem you faced while coding this : No

/*
Approach -:

We need to maintain the unique mapping from s to pattern and pattern to s.

To maintain the mapping from pattern to s, I have used hashmap because of its optimized search
while iterating over every character in the pattern

To check s to pattern mapping, I have used hashset. While storing pattern to s mapping, I have stored the
word (from s) in the hashset. This ensures s to pattern mapping is unique.

Hashmap is not needed in the case of s to pattern mapping. Because we are checking the existence
of key in pattern to s hashmap.
 */
import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null) return false;

        String[] words = s.split(" ");
        int patternLen = pattern.length();

        if(words.length != patternLen) return false;

        Map<Character, String> wordMapping = new HashMap<>();
        Set<String> trackedWords = new HashSet<>();

        for(int i = 0; i < patternLen; i++) {
            if(wordMapping.containsKey(pattern.charAt(i))) {
                if(!wordMapping.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                if(trackedWords.contains(words[i])) {
                    return false;
                }
                wordMapping.put(pattern.charAt(i), words[i]);
                trackedWords.add(words[i]);
            }
        }

        return true;
    }
}
