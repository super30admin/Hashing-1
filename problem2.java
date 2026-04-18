// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No




import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl != tl) return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for(int i = 0; i<sl;i++){
            if(smap.containsKey(s.charAt(i))){
                if(smap.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else{
                smap.put(s.charAt(i),t.charAt(i));
            }
            if(tmap.containsKey(t.charAt(i))){
                if(tmap.get(t.charAt(i))!=s.charAt(i)) return false;
            }
            else{
                tmap.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}