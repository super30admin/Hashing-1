import java.util.HashMap;
import java.util.Map;

public class Problem_3 {

    boolean isomorphicStrings(String pattern, String str) {
        String[] s = str.split(" ");
        if (s.length != pattern.length()) return false;
        Map<Character, String> firstMap = new HashMap<>();
        Map<String, Character> secondMap = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            String c1 = s[i];
            char c = pattern.charAt(i);
            if (firstMap.containsKey(c) && secondMap.get(c1) == c) {
                // do nothing
            } else if (firstMap.get(c) == null && !secondMap.containsKey(c1)) {
                firstMap.put(c, c1);
                secondMap.put(c1, c);
            } else return false;
        }
        return true;

    }
}
