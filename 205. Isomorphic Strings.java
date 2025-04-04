class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            sMap.putIfAbsent(s.charAt(i), t.charAt(i));
            if(sMap.get(s.charAt(i)) != t.charAt(i)) return false;
            tMap.putIfAbsent(t.charAt(i), s.charAt(i));
            if(tMap.get(t.charAt(i)) != s.charAt(i)) return false;
        }
        return true;
    }
}