// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            if(sMap.containsKey(c1)){
                if(sMap.get(c1) != c2){
                    return false;
                }
            }
            else {
                sMap.put(c1,c2);
            }
            if(tMap.containsKey(c2)){
                if(tMap.get(c2) != c1){
                    return false;
                }
            }
            else {
                tMap.put(c2,c1);
            }
        }
        return true;
    }
}