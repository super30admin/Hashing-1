// Time Complexity : O(n)
// Space Complexity : O(k)
// Iterate through each character in the strings s and t. Use a HashMap to keep track of the mapping between characters in s and t.
// If the character from s is already in the mapping and doesn't correspond to the same character in t, or if the character from t is already used for another mapping, return false.
// If the above conditions are not met for all characters, return true.

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean areIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> mapping = new HashMap<>();
        HashSet<Character> usedChars = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (mapping.containsKey(charS)) {
                if (mapping.get(charS) != charT)
                    return false;
            } else {
                if (usedChars.contains(charT))
                    return false;
                mapping.put(charS, charT);
                usedChars.add(charT);
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg", t1 = "add";
        System.out.println(areIsomorphic(s1, t1)); // Output: true
        
        String s2 = "foo", t2 = "bar";
        System.out.println(areIsomorphic(s2, t2)); // Output: false
        
        String s3 = "paper", t3 = "title";
        System.out.println(areIsomorphic(s3, t3)); // Output: true
    }
}
