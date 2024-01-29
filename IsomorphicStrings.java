// Time complexity: O(n) where n = length of the string s or t
// Space complexity: O(n): where n = Hashmap and hashset size whichever is bigger
/* Approach: We maintain a hashmap for the mappings and a hashset for the already mapped values. We begin iterating, if the mapping already exists
* and is not the same as the value of char in t string, then we return false as one element cant have two mappings.
* Another edge case to keep in mind is that no two elements can map to the same char. So, we keep track of the mapped elements in a set.
* If there is a new char which is not already in the map trying to point to a char which is in the set, this means two elements are trying to
* point to the same char.
*/

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashSet<Character> set = new HashSet<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char currentT = t.charAt(i);
            // check if current is in map
            if (map.containsKey(currentS)) {
                // current value has the same mapping as the hashmap
                if (map.get(currentS).equals(currentT)) {
                    continue;
                } else {
                    // current value is already mapped to another string
                    return false;
                }
            }
            // no mapping but if char at "t" is already mapped to some other string
            if (set.contains(currentT)) {
                return false;
            }
            map.put(currentS, currentT);
            set.add(currentT);
        }
        return true;
    }
}