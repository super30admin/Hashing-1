// Time Complexity : O(n) where n is the number of words in the string
// Space Complexity : O(n) for the two HashMaps
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// We maintain mappings in both directions to enforce a one-to-one relationship between pattern characters and words.
// While traversing, we verify that every existing mapping remains consistent.
// If a character maps to multiple words or a word maps to multiple characters, the pattern is invalid.

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" ");
        int n = str.length;
        int k = pattern.length();

        if(n != k) return false;

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for(int i = 0; i < n; i++) {

            char c = pattern.charAt(i);

            // validate character -> word mapping
            if(!pMap.containsKey(c)) {
                pMap.put(c, str[i]);
            } else {
                if(!pMap.get(c).equals(str[i])) return false;
            }

            // validate word -> character mapping
            if(!sMap.containsKey(str[i])) {
                sMap.put(str[i], c);
            } else {
                if(!sMap.get(str[i]).equals(c)) return false;
            }
        }

        return true;
    }
}