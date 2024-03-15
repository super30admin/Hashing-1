// TC:
// SC:

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] sa = s.split(" ");

        if (sa.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(sa[i])) {
                    return false;
                }
            } else {
                map.put(pattern.charAt(i), sa[i]);
                if (set.contains(sa[i]))
                    return false;
                else
                    set.add(sa[i]);
            }
        }
        return true;
    }
}
