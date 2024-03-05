import java.util.HashMap;
/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Approach: We've used two maps for 2 strings and we're storing the character mapping in each map both ways
 * so we have if mapping exists from a character from string s to string t and vice versa and if the mappings
 * exists then the strings are isomorphic
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())return false;
        if(s == null || t == null) return false;
        if(s == null && t == null) return true;
        
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i = 0;i< s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }else
               sMap.put(sChar, tChar);//establish the mapping

            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar) return false;
            }else
               tMap.put(tChar, sChar);
    }
    return true;
    }
}