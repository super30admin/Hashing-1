// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yess
// Any problem you faced while coding this :No

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map= new HashMap<>();
        String splitted[]= s.split(" ");
        if(splitted.length!=pattern.length()) return false;

        for(int i=0; i<pattern.length();i++){
            char pchar= pattern.charAt(i);
            String currentWord= splitted[i];
            
        if(!map.containsKey(pchar)){
            if(!map.containsValue(currentWord)){
                map.put(pchar, currentWord);
            }
            else{
                return false;
            }
        } else{
        if(!map.get(pchar).equals(currentWord)){
            return false;
        }
        }
        }
        return true;
    }
}
