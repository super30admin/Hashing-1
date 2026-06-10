import java.util.*;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hs = new HashMap<>();
        HashMap<Character,Character> ht = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        } 
        for (int i=0; i<s.length(); i++){
            char sc = s.charAt(i);
            char st = t.charAt(i);

            if (!hs.containsKey(sc)) {
                hs.put(sc,st);
            } else {
                if (!hs.get(sc).equals(st)) {
                    return false;
                }
            }
            if (!ht.containsKey(st)) {
                ht.put(st,sc);
            } else {
                if (!ht.get(st).equals(sc)) {
                    return false;
                }
            }
        }

        return true;

    }
}
