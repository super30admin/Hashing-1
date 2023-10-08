import java.util.HashMap;

class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        HashMap<Character, Character> hmc = new HashMap<Character, Character>();

        for (int i = 0; i < t.length(); i++) {
            if (hmc.containsKey(t.charAt(i))) {
                if (hmc.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                hmc.put(t.charAt(i), s.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                if (hm.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                hm.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean res = isIsomorphic(s, t);
    }
}