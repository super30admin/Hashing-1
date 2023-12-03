// Time Complexity : O(N)
// Space Complexity : O(mk) + O(nk)  m is pattern size n i string size, is the max length of word
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length) {
            return false;
        }
        HashMap<Character,String> pMap = new HashMap<>();
        HashMap<String,Character> sMap = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            Character c1 = pattern.charAt(i);
            String s2 = words[i];
            if(pMap.containsKey(c1)){
                if(!s2.equals(pMap.get(c1))){
                    return false;
                }
            }
            else {
                pMap.put(c1,s2);
            }
            if(sMap.containsKey(s2)){
                if(sMap.get(s2) != c1){
                    return false;
                }
            }
            else {
                sMap.put(s2,c1);
            }
        }
        return true;
    }
}