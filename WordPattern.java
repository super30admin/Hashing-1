// Time Complexity: O(n)
// Space Complexity: O(M) where M is the number of words

// Approach - same as https://leetcode.com/problems/isomorphic-strings/


class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> patternmap = new HashMap<>();
        HashMap<String,Character> smap = new HashMap<>();
        
        String[] words = s.split(" ");
        
        if (words.length != pattern.length())
            return false;
        
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (!patternmap.containsKey(c)) {
                patternmap.put(c, w);
            }
            else {
                if (!patternmap.get(c).equals(w)) {
                    return false;
                }
            }
            
            if (!smap.containsKey(w)) {
                smap.put(w, c);
            }
            else {
                if (!smap.get(w).equals(c)) {
                    return false;
                }
            }
        }
        
        return true;  
    }
}