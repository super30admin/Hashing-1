// Time Complexity :O(n) 
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
// Using two hashmap: one for pattern to word matching and another for word to pattern matching(one-one)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");// Separate words from s
        int n = words.length;
        int k = pattern.length();
        if(n!=k) return false;//if number of words != pattern length, then definite mismatch
        HashMap<Character,String> pmap = new HashMap<>();//pattern to word 
        HashMap<String,Character> smap = new HashMap<>();//word to pattern 
        for(int i=0;i<n;i++){
            char c = pattern.charAt(i);
            if (!pmap.containsKey(c)){//new entry to pmap
                pmap.put(c, words[i]);
            } 
            else{
                if (!pmap.get(c).equals(words[i])) return false;//mismatch
            }
            if (!smap.containsKey(words[i])){//new entry to smap
                smap.put(words[i], c);
            } 
            else{
                if (!smap.get(words[i]).equals(c)) return false;//mismatch
            }
        }
        return true;
    }
}