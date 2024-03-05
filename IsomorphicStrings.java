import java.util.HashMap;

public class IsomorphicStrings {
    // Time Complexity = O(n), where n is the length of input string
    // Space Complexity = O(1) because valid ascii length is 256
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        if(s==null || t==null) return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        // As s and t length is equal
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // check if sMap has sChar
            if(sMap.containsKey(sChar)){
                // if yes, then check if it is equals to tChar
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else {
                // key is not present, put it
                sMap.put(sChar, tChar);
            }

            // check if tMap has tChar
            if(tMap.containsKey(tChar)){
                // if yes, then check if it is equals to sChar
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            } else {
                // key is not present, put it
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}
