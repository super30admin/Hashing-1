// Time Complexity : O(n * k), where n = number of words and k = average word length (for string comparisons and hash set lookups)
// Space Complexity : O(n * k), for storing the hashmap and hashset
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// We use a HashMap to store the mapping of each pattern character to a word.
// A HashSet is used to ensure that no two characters map to the same word (i.e., the mapping is bijective).
// If at any point the expected mapping breaks or duplicates are detected, return false. Else, return true.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Size of pattern
        int n = pattern.length();
        // Split the string into words
        String[] word = s.split(" ");
        int m = word.length;

        // If lengths mismatch, they cannot follow the same pattern
        if(n != m) return false;

        // Map to store pattern to word character mapping
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String val = word[i];

            if(map.containsKey(key)) {
                // If the word is already mapped, it must map to the same pattern character
                if(!map.get(key).equals(val)) return false;
            } else {
                // If this pattern character was already assigned to another word
                if(set.contains(val)) return false;
                // Otherwise, create a new mapping
                map.put(key, val);
                set.add(val);
            }
        }
        // All mappings consistent
        return true;
    }
}