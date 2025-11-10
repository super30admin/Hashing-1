// The solution utilizes HashMap data-structure to map characters from string s to string t
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length() || s == null || s.length() == 0) {
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        //HashMap<Character, Character> tMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i< s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)) {
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            }
            else {
                sMap.put(sChar, tChar);
                if(set.contains(tChar)) {
                    return false;
                }
                set.add(tChar);
            }
        }
        return true;
    }
}