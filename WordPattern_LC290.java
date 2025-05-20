//Did this code successfully run on Leetcode :  Yes
//Any problem you faced while coding this :  No
//Time complexity - O(N) + O(K) where k is the words in splited array
//Space complexity - O(N)
import java.util.HashMap;

public class WordPattern_LC290 {
    public boolean wordPattern(String pattern, String s) {

        HashMap wordMapping = new HashMap(); //O(N) space
        String[] words = s.split(" "); //O(K) time to split and O(N) to store
        int pLen = pattern.length(); int sLen = words.length;
        if(pLen != sLen) return false;
        for(Integer i = 0; i<words.length; i++) { //O(N) time
            char c= pattern.charAt(i);
            String w = words[i];
            if(!wordMapping.containsKey(c)) { //O(1)
                wordMapping.put(c,i);
            }
            if(!wordMapping.containsKey(w)) { //O(1)
                wordMapping.put(w,i);
            }
            if(wordMapping.get(c) != wordMapping.get(w)) return false;
        }
        return true;
    }
}