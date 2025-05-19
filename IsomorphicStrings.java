/* Intuition : take strings, put their characters and character indices in maps compare as you go for index mappings
TC : o(n)
SC: o(n)
* */
import java.util.*;
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if(!smap.containsKey(s.charAt(i)))
                smap.put(s.charAt(i), i);

            if(!tmap.containsKey(t.charAt(i)))
                tmap.put(t.charAt(i), i);

            if (!smap.get(s.charAt(i)).equals(tmap.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
