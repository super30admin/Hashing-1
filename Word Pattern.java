import java.util.HashMap;
// Time Complexity :O (N)
// Space Complexity :O(N)  
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach in three sentences only
// Similar to isomorphic string, we will maintain 2 hashmaps for pattern and words.
// We will go through each character of pattern and corresponding word in s, and check if the mapping exists in the respective hashmaps.
// If the mapping exists, we will check if it matches the corresponding word in s and character in pattern respectively.
//  If it does not match, we will return false. 
// If the mapping does not exist, we will add the new mapping to the respective hashmaps
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        // length mismatch
        if (words.length != pattern.length()) return false;

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String word = words[i];

            if (map1.containsKey(p)) {
                if (!map1.get(p).equals(word)) return false;
            } else {
                map1.put(p, word);
            }

            if (map2.containsKey(word)) {
                if (map2.get(word) != p) return false;
            } else {
                map2.put(word, p);
            }
        }

        return true;
    }
}