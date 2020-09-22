// Time Complexity : O(k) where k is the length of the pattern string
// Space Complexity : O (k+W) for storing all k chars from pattern string and words, in the HashMap 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// This idea is to create a hashmap with mappings from key as chars to words
// if we encounter inconsistencies, return false

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        String[] words = s.split(" ");
        
        if(words.length != pattern.length()){
            return false;
        }
        
        for(int i=0; i<words.length;i++){
            char c = pattern.charAt(i);
            String w = words[i];
            
            if(!map.containsKey(c)){
                if(!map.containsValue(w)){
                    map.put(c, w);
                }
                else{
                    return false;
                }
            }
            if(!map.get(c).equals(w)){
                return false;
            }
        }
        return true;
    }
}