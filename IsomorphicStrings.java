//Time Complexity - O(n)
//Space Complexity - O(1) as the alphabets are fixed

// Implemented using a HashMap and HashSet In the HashMap the key is character at s and value is character at t
// the t character is also added to the set.
import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, tChar);
                if(tSet.contains(tChar)){
                    return false;
                }
                tSet.add(tChar);
            } else {
                if(sMap.get(sChar) != tChar) {
                    return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args){
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphic("foo", "bar" ));
    }
}
