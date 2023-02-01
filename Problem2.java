import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//time: O(n)
//space: O(1)
public class Problem2 {
    static boolean areIso(String s1, String s2) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i=0;i<s1.length();i++){
            char s1char = s1.charAt(i);
            if (!map.containsKey(s1char)) {
                if (set.contains(s2.charAt(i))) return false;
                map.put(s1char, s2.charAt(i));
                set.add(s2.charAt(i));
            }
            else {
                if (map.get(s1char)!=s2.charAt(i))
                    return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("given string are "+(areIso("e", "a")?"isomorphic":"not isomorphic"));
    }
}
