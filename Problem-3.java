// Time Complexity: O(n + m), where n is the length of pattern and m is the length of string s.
// Space Complexity: O(m), for storing the words and mappings.

// Approach: Split the string into words and check if the number of words matches the length of the pattern.
// Use two HashMaps to maintain a one-to-one mapping between characters and words in both directions.
// If any existing mapping does not match the current character and word, return false; otherwise, update both maps and continue.

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length() == 0 || s.length() == 0){
            return false;
        }
        HashMap<Character,String> ctos = new HashMap<>();
        HashMap<String,Character> stoc = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
    return false;
}
        for(int i=0;i<pattern.length(); i++){
            if(ctos.containsKey(pattern.charAt(i)) && !ctos.get(pattern.charAt(i)).equals(words[i])){
                return false;
            }
            if(stoc.containsKey(words[i]) && !stoc.get(words[i]).equals(pattern.charAt(i))){
                return false;
            }
            ctos.put(pattern.charAt(i),words[i]);
            stoc.put(words[i],pattern.charAt(i));
        }
        return true;
    }
}
