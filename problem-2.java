// Time Complexity : O(n) where n is the length of the string
// Space Complexity : O(n+n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<Character,Character>();
        HashMap<Character, Character> tMap = new HashMap<Character,Character>();
        int slen = s.length();
        int tlen = t.length();
        if(slen!=tlen){
            return false;
        }
        for (int i=0; i<slen; i++){
            if (sMap.get(s.charAt(i)) == null){
                sMap.put(s.charAt(i), t.charAt(i));
            }
            else{
                if(sMap.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            if (tMap.get(t.charAt(i)) == null){
                tMap.put(t.charAt(i), s.charAt(i));
            }
            else{
                if(tMap.get(t.charAt(i))!=s.charAt(i)) return false;
            }
        }
        return true;
    }
}
