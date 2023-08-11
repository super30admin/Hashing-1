// TC = O(n)
// SC = O(1)


import java.util.HashMap;

public class IsonmorphicOne {

    public static void main(String[] args) {
        String s = "abba";
        String t = "dog cat cat dog";

        IsonmorphicOne obj1 = new IsonmorphicOne();
        boolean obj2 = obj1.wordPattern(s, t);
        System.out.println("Are the strings isomorphic? " + obj2);
    }

    public boolean wordPattern(String pattern, String t) {
        String[] words = t.split(" ");
        
        if (pattern.length() != words.length)
            return false;

        HashMap<Character, String> smap = new HashMap<>();
        HashMap<String, Character> tmap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char sChar = pattern.charAt(i);
            String word = words[i];

            if (smap.containsKey(sChar)) {
                if (!smap.get(sChar).equals(word))
                    return false;
            } else {
                if (tmap.containsKey(word)) {
                    if (tmap.get(word) != sChar)
                        return false;
                } else {
                    smap.put(sChar, word);
                    tmap.put(word, sChar);
                }
            }
        }
        return true;
    }
}
