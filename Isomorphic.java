import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //hashmap
        //map values of s to values of t. if key already exists and value not same as existing value, not isomorphic
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                if(sMap.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else{
                sMap.put(s.charAt(i),t.charAt(i));
            }
            if(tMap.containsKey(t.charAt(i))){
                if(tMap.get(t.charAt(i))!=s.charAt(i)) return false;
            }
            else{
                tMap.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}