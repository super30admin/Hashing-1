import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/*Time Complexity : O(m +n ); where n is length of pattern and n is size of words in s
 * Space Complexity : O(m +n ); where n is length of pattern and n is size of words in s
  */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null) return false;
        if (pattern == null && s == null) return true;
        List<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        if (pattern.length() != words.size()) return false;

        HashMap <Character, String> pMap = new HashMap<>();
        HashMap <String, Character> sMap = new HashMap<>();

        for (int i = 0; i <pattern.length(); i++){
            char pChar = pattern.charAt(i);
            String sWord = words.get(i);
            if (pMap.containsKey(pChar)){
                if (!pMap.get(pChar).equals(sWord)) return false;
            }else{
                pMap.put(pChar, sWord);
            }
            if (sMap.containsKey(sWord)){
                if (sMap.get(sWord) != pChar) return false;
            }else{
                sMap.put(sWord, pChar);
            }
        }
        return true; 
        
    }
}
