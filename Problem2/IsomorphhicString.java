package Problem2;

import java.util.*;

public class IsomorphhicString {

    static boolean isIsomorphic(String s, String t) {
        int len = s.length();
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < len; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a) && map.get(a) != b) return false;

            map.put(a, b);
        }
        map.clear();
        for(int i = 0; i < len; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(b) && map.get(b) != a) return false;

            map.put(b, a);
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println("Is " + s + " and  " + t + " are isomorphic : " + isIsomorphic(s, t));

    }
}
