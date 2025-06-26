// Time Complexity : O(n k) -> spliting the String s into words take O(n k) time there after it is O(n)
// Space Complexity : O(1) -> it may look like O(n) 
    // there are only going to be finite number of characters
    // the space become O(26) -> O(1)
//  Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
    //None

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");

        //base case
        if(words.length != pattern.length()){
            return false;
        }

        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> strMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(charMap.containsKey(c)){
                if( !(charMap.get(c).equals(word)) ){
                    return false;
                }
            }
            else{
                charMap.put(c, word);
            }

            if(strMap.containsKey(word)){
                if( !(strMap.get(word).equals(c)) ){
                    return false;
                }
            }
            else{
                strMap.put(word, c);
            }

        }

        return true;
    }
}