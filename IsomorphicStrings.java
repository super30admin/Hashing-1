import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> firstMap = new HashMap<>();
        Map<Character, Character> secondMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);
            if (firstMap.containsKey(c) && secondMap.get(c1) == (Character) c) {
                // do nothing
            } else if (firstMap.get(c) == null && !secondMap.containsKey(c1)) {
                firstMap.put(c, c1);
                secondMap.put(c1, c);
            } else return false;
        }
        return true;
    }
}
