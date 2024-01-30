//Time Complexity - O(n)
//Space Complexity - O(n)
/*Approach - A HashMap is used to store mappings from characters in the first string to words in the second array.
A hashet is used to store the mapped values for faster lookup and verification.*/

import java.util.HashMap;
import java.util.HashSet;

class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        String[] arrayOfStrings = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        if (pattern.length() != arrayOfStrings.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!arrayOfStrings[i].equalsIgnoreCase(map.get(pattern.charAt(i)))) {
                    return false;
                }
            } else {
                if (set.contains(arrayOfStrings[i])) {
                    return false;
                }

                map.put(pattern.charAt(i), arrayOfStrings[i]);
                set.add(arrayOfStrings[i]);
            }
        }

        return true;
    }

}
