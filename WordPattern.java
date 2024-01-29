// Time complexity: O(n) where n = length of the string s
// Space complexity: O(n): where n = Hashmap and hashset size whichever is bigger
/* Approach: We maintain a hashmap for the mappings and a hashset for the already mapped string values. We begin iterating, if the mapping already exists
* and is not the same as the value of string in string array, then we return false as one element cant have two mappings.
* Another edge case to keep in mind is that no two elements can map to the same char. So, we keep track of the mapped elements in a set.
* If there is a new char which is not already in the map trying to point to a string which is in the set, this means two elements are trying to
* point to the same string.
*/

import java.util.HashMap;
import java.util.HashSet;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        HashSet<String> set = new HashSet<String>();

        String[] strArr = s.split(" ");

        // they need to be of equal length to be bijective
        if (pattern.length() != strArr.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentString = strArr[i];

            // cant map to empty string
            if (currentString.equals(' '))
                return false;

            if (map.containsKey(currentChar)) {
                // mapping still holds
                if (map.get(currentChar).equals(currentString)) {
                    continue;
                } else {
                    // mapping to two elements
                    return false;
                }
            }

            // string is already mapped to some other char
            if (set.contains(currentString)) {
                return false;
            }

            map.put(currentChar, currentString);
            set.add(currentString);
        }

        return true;
    }
}