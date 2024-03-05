import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    // Time Complexity = O(n), where n is the length of input string (max(pattern.length, s.split(" ").length)
    // Space Complexity = O(1) because valid ascii length is 256, in here we are using lowercase so 26
    public static boolean wordPattern(String pattern, String s) {
        // null check
        if(s == null || pattern == null) return false;

        // if lengths differ return false
        if(pattern.length() != s.split(" ").length) return false;

        // create string array separated by spaces
        String[] sArray = s.split(" ");

        // create two maps to keep mappings
        Map<String, Character> sMap = new HashMap<>();
        Map<Character, String> pMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){

            String sString = sArray[i];
            char pChar = pattern.charAt(i);

            // check if sString is present in sMap
            if(sMap.containsKey(sString)){
                // if yes, check if it is mapped to current pChar
                if(sMap.get(sString) != pChar) return false;
            } else {
                // put an entry
                sMap.put(sString, pChar);
            }

            // check if pChar is present in pMap
            if(pMap.containsKey(pChar)){
                // if yes, check if it is mapped to current sString
                if(!pMap.get(pChar).equals(sString)) return false;
            } else {
                // put an entry
                pMap.put(pChar, sString);
            }

        }
        return true;
    }

    public static void main(String args[]){
        wordPattern("abba", "dog cat cat dog");
    }
}
