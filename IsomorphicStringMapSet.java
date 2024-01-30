import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Time Complexity - O(n) => s.length()
// Space Complexity - O(n)

// Constraints:
// 1 <= s.length <= 5 * 10^4
// t.length == s.length
// s and t consist of any valid ascii character.

public class IsomorphicStringMapSet {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            Map<Character, Character> mapS = new HashMap<>();
            Set<Character> setT = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                char currS = s.charAt(i);
                char currT = t.charAt(i);
                if (mapS.containsKey(currS)) {
                    if (mapS.get(currS) != currT) { // If map has key mapped to same value
                        return false;
                    }
                } else if (setT.contains(currT)) { // Key not in map but value mapped to some other key
                    return false;
                } else { // Neither key in map nor value in set
                    mapS.put(currS, currT);
                    setT.add(currT);
                }
            }
            return true;
        }
    }
}