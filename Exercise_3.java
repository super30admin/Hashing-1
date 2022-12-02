// Word Pattern
// Time Complexity : O(n)
// Space Complexity : O(M) where M is the number of unique characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.


// Approach
// we can solve this problem using two hashmap like we did in the Isomorphic Strings problem. But, tried using one hashmap.
// create a hashmap which will keep track of the first occurrences of each character in pattern and each word in s.
// iterate through each character-word pair. if it's not present, insert unseen characters from pattern and unseen words from s.
// then will compare the indices of each character and word match up or not. As soon as find a mismatch, return False.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap map = new HashMap();
        String[] words = s.split(" ");

        if(words.length != pattern.length())
            return false;

        for(Integer i=0; i<words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            //if key not present earlier
            if(!map.containsKey(c)) {
                map.put(c, i);
            }
            if(!map.containsKey(word)) {
                map.put(word, i);
            }
            //compare the index
            if(map.get(c) != map.get(word))
                return false;
        }
        return true;
    }
}
