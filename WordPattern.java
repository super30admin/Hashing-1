/* Problem 1:
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : yes
*/
class Solution {
    public boolean wordPattern(String pattern, String s) {

        if(pattern.length()==0 || s.length()==0) return false;
        String[] words = s.split(" ");

        if(pattern.length()!=words.length) return false;

        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            if((map1.containsKey(pattern.charAt(i)) 
            && !map1.get(pattern.charAt(i)).equals(words[i]))||
            (map2.containsKey(words[i]) 
            && !map2.get(words[i]).equals(pattern.charAt(i)))){
                return false;
            }else{
                map1.put(pattern.charAt(i),words[i]);
                map2.put(words[i],pattern.charAt(i));
            }
        }
        return true;
    }
}