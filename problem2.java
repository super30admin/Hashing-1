import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//We use a Map and an array here to find if the given strings are isomorphic or not. we store the corresponding char of s String using the map and use set to verify if the char is already paired in reverse order case.
// TC is 0(N) SC is O(1)
public class problem2 {
    public boolean isIsomorphic(String s, String t){
        Map<Character, Character> sMap = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for( int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.get(sChar)!= null){
                if(sMap.get(sChar) != tChar) return false;
            }
            else {
                if (set.contains(tChar)) return false;
                sMap.put(sChar, tChar);
                set.add(tChar);
            }
        }
        return true;
    }
}
