import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false; // Strings with different lengths cannot be isomorphic
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (!map.containsKey(ch1)) {
                if (!set.contains(ch2)) {
                    map.put(ch1, ch2);
                    set.add(ch2);
                } else { // meaning the set already contains a value which might have been mapped to char
                         // from S- rendering it no longer isomprphic
                    return false;
                }
            } else {
                if (map.get(ch1) != ch2)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings obj = new IsomorphicStrings();
        String s = "eggg";
        String t = "addd";
        System.out.println(" Are they isomorphic: " + obj.isIsomorphic(s, t));

    }
}
