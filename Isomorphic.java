// TC = O(n)
// SC = O(1)

import java.util.HashMap;

public class Isomorphic {

    public static void main(String[] args) {
        //String[] arr = { "eat", "eat", "tan", "ate", "nat", "bat" };
        String s = "cat";
        String t = "bat";

        Isomorphic obj1 = new Isomorphic();
        boolean obj2 = obj1.isIsomorphic(s, t);
        System.out.println("isomorphic value" + "\t" + obj2);

    }

    public boolean isIsomorphic(String s, String t) {

        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;

        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        
        if(s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (smap.containsKey(sChar)) {

                if (smap.get(sChar) != tChar)
                    return false;
            } else {
                smap.put(sChar, tChar);
            }

            if (tmap.containsKey(tChar)) {
                if (tmap.get(tChar) != sChar)
                    return false;
            } else {
                tmap.put(tChar, sChar);
            }
        }
        return true;

    }

}