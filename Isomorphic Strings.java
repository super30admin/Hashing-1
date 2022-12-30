Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
            
        HashMap <Character, Character> sMap = new HashMap <>();
        HashMap <Character, Character> tMap = new HashMap <>();
                 
        for (int i = 0; i< s.length(); i++){
            //char charS = s.charAt(i);
            //char charT = t.charAt(i);
            
            if (tMap.get(t.charAt(i)) == null && !sMap.containsKey(s.charAt(i))) {
                tMap.put(t.charAt(i), s.charAt(i)); 
                sMap.put(s.charAt(i), t.charAt(i));
            }
            else if (!sMap.containsKey(s.charAt(i)) || sMap.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            else if (!tMap.containsKey(t.charAt(i)) || tMap.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
        }
    return true;
    }
}
