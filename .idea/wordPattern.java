// Time Complexity : O(K) ; k is th elength of the pattern
// Space Complexity : O(K) ; k is th elength of the pattern
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach in three sentences only
//check if the current character in pattern has been assigned a word if yes check if the current assigned word is also same
//also check if the word being assigned has been assigned to any other character earlier then return false

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length() != words.length) return false;


        HashMap<Character, String> sM = new HashMap<>();
        HashMap<String, Character> tM = new HashMap<>();

        for(int i = 0;i<pattern.length();i++){

            if (sM.containsKey(pattern.charAt(i))) {
                if (!sM.get(pattern.charAt(i)).equals(words[i])) return false;
            } else if (tM.containsKey(words[i])) {
                if (tM.get(words[i]) != pattern.charAt(i)) return false;
            } else {
                sM.put(pattern.charAt(i), words[i]);
                tM.put(words[i], pattern.charAt(i));
            }

        }

        return true;
    }
}