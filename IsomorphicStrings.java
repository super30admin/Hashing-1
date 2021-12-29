import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                if(!set.contains(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                    set.add(t.charAt(i));
                }
                else {
                    return false;
                }
            } else {
                if(map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }

        }

        return true;
    }
}
