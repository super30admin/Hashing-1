// Time Complexity : O(n) where n is the length of the pattern string
// Space Complexity : O(n*m) where m is the length of each word in the s string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        String[] str = s.split(" ");
        int plen = pattern.length();
        int slen = str.length;
        if(slen!=plen){
            return false;
        }
        for (int i=0; i<plen; i++){
            if (pMap.get(pattern.charAt(i)) == null){
                pMap.put(pattern.charAt(i), str[i]);
            }
            else{
                if(!pMap.get(pattern.charAt(i)).equals(str[i])){
                     return false;
                }
            }
            if (sMap.get(str[i]) == null){
                sMap.put(str[i], pattern.charAt(i));
            }
            else{
                if(sMap.get(str[i])!=pattern.charAt(i)){
                     return false;
                }
            }
            
        }
        return true;
    }
}
