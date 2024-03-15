// TC: O(nk)
// SC: O(nk)

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" ");

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        if (str.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i), str[i]);
                if (set.contains(str[i])) return false;
                else set.add(str[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(str[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
