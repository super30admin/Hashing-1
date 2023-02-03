/*
 * Time Complexity : O(n)
 * Space Complexity :  O(n)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - Similar to isomorphic strings, we map every character of the string s to a word in the string t. We do reverse map as well. If the character or word exists in the 
 * map then we check if the values are same. If not we return false. Else, true. 
 */
//https://leetcode.com/problems/word-pattern/description/

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> wordCharMap = new HashMap<>();
        HashMap<String, Character> WordMap = new HashMap<>();
        String[] sen = s.split(" ",0);
        if(pattern.length()!=sen.length)return false;
        for(int i=0;i<pattern.length();i++){
            if(wordCharMap.containsKey(pattern.charAt(i))){
                if(!wordCharMap.get(pattern.charAt(i)).equals(sen[i]))return false;
            }else{
                wordCharMap.put(pattern.charAt(i),sen[i]);
            }
            if(WordMap.containsKey(sen[i])){
                if(!WordMap.get(sen[i]).equals(pattern.charAt(i)))return false;
            }else{
                WordMap.put(sen[i],pattern.charAt(i));
            }
        }
        return true;
    }
}