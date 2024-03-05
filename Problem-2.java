import java.util.HashMap;

/*Time complexity : O(n);
 * Space COmplexity : O(1) and worst case :O(n);
 * 
 * 
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) return false;
        if (s == null && t == null) return true;
        if (s.length() != t.length()) return false;

        HashMap<Character, Character > sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++){ //O(n)
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)){ //O(1)
                if (sMap.get(sChar) != tChar) return false;
            }else{
                sMap.put(sChar, tChar); //O(1)
            }
            if (tMap.containsKey(tChar)){ //O(1)
                if (tMap.get(tChar) != sChar) return false;
            }else{
                tMap.put(tChar, sChar);//O(1)
            }
        }
        return true;
        
    }
}