import java.util.HashMap;
import java.util.Map;

//Time Complexity - O(n) => s.length()
// Space Complexity - O(n)

// Constraints:
// 1 <= s.length <= 5 * 10^4
// t.length == s.length
// s and t consist of any valid ascii character.

public class IsomorphicStringsTwoMaps {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            Map<Character, Character> mapS = new HashMap<>();
            Map<Character, Character> mapT = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char currS = s.charAt(i);
                char currT = t.charAt(i);
                if (mapS.containsKey(currS)) {
                    if (mapS.get(currS) != currT) {
                        return false;
                    }
                }
                if (mapT.containsKey(currT)) {
                    if (mapT.get(currT) != currS) {
                        return false;
                    }
                }

                mapS.put(currS, currT);
                mapT.put(currT, currS);
            }
            return true;
        }
    }

}