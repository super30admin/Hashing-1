/*this implementation uses Hashmap to store mapping between characters
 * the time complexity of this implementation is O(n) where n is length of the string*/
import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (map.containsKey(sChar)) {
                if (map.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if (map.containsValue(tChar)) {
                    return false;
                }
                map.put(sChar, tChar);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        Isomorphic solution = new Isomorphic();
        boolean result1 = solution.isIsomorphic(s1, t1);
        System.out.println(result1);  // Output: true

        String s2 = "foo";
        String t2 = "bar";
        boolean result2 = solution.isIsomorphic(s2, t2);
        System.out.println(result2);  // Output: false
    }
}
