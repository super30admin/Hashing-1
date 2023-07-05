// Time Complexity : O(l+k(min(w1,w2)))
// Space Complexity : O(k + l)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/**
 * 1. Map the characters of pattern to words of s and also reverse mapping of words to characters.
 * 2. If the current character of pattern is not present in map, check if the word is already present in set.
 * 3. If yes, return false.
 * 4. Else, add the mapping of pattern to word in map and add word to set.
 * 5. If the current character of pattern is present in map, check if the word is same as the value in map.
 * 6. If not, return false.
 * 7. Return true.
 */

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" "); //O(l)
        int patLen = pattern.length(), sLen = words.length;
        if(patLen != sLen)
            return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<patLen; i++){ //O(k)
            char ch = pattern.charAt(i);
            String word = words[i];

            if(!map.containsKey(ch)){
                if(!set.contains(word)){
                    map.put(ch, word);
                    set.add(word);
                }else{
                    return false;
                }
            }else {
                String mapWord = map.get(ch);
                if(!mapWord.equals(word)){ //O(min(w1,w2))
                    return false;
                }
            }
        }

        return true;
    }
}