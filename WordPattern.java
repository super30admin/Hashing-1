// Time Complexity : O(n) where n is the length of the input pattern
// Space Complexity : O(n) where n is the number of words in the input string s
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
import java.util.HashMap;
class WordPattern {
    public boolean wordPattern(String pattern, String s)
    {
        if(pattern == null){
            if(s == null) return true;
            else return false;
        }

        //now split the string into words
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        if(pattern.length() == 1){
            return true;
        }
        String[] arr = new String[26];
        HashMap<String, Integer> wMap = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            if(arr[pattern.charAt(i) - 'a'] !=null &&
                    !arr[pattern.charAt(i) - 'a'].equals(words[i])){
                return false;
            }
            if(wMap.containsKey(words[i])){
                if(wMap.get(words[i]) != pattern.charAt(i) - 'a'){
                    return false;
                }
            }
            else{
                wMap.put(words[i], pattern.charAt(i) - 'a');
            }
            arr[pattern.charAt(i) - 'a'] = words[i];
        }
        return true;
    }
}