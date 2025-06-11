// Time Complexity : O(n), where n is the number of words in the string `s`
// Space Complexity : O(n), for storing mappings in HashMap and the boolean array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Approach: We use a HashMap to map each word (by its hashcode) to a character in the pattern.
// We also use a boolean array to ensure no two characters map to the same word.
// If a mismatch or duplicate mapping is found, return false. Otherwise, return true.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Size of pattern
        int n = pattern.length();
        // Split the string into words
        String[] word = s.split(" ");
        int m = word.length;

        // If lengths mismatch, they cannot follow the same pattern
        if(n != m) return false;

        // Map to store word hash to pattern character mapping
        HashMap<Integer, Character> map = new HashMap<>();
        // Boolean array to check if a pattern character is already used
        boolean[] set = new boolean[50]; // Can hold up to 26 lowercase letters safely

        for (int i = 0; i < word.length; i++) {
            int key = word[i].hashCode(); // Hash the word for mapping
            char pat = pattern.charAt(i); // Current pattern character

            if(map.containsKey(key)) {
                // If the word is already mapped, it must map to the same pattern character
                if(map.get(key) != pat) return false;
            } else {
                // If this pattern character was already assigned to another word
                if(set[pat - 'a']) return false;
                // Otherwise, create a new mapping
                map.put(key, pat);
                set[pat - 'a'] = true;
            }
        }
        // All mappings consistent
        return true;
    }
}