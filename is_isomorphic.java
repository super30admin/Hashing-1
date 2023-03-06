import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

// Time Complexity: O(n); n = s.length() = t.length()
// Space Complexity: O(n); one for hashmap another for hashset.
// Did this code run on leetcode? : Yes
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> seen = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                } else {
                    continue;
                }
            }

            if(seen.contains(t.charAt(i))) {
                return false;
            }

            map.put(s.charAt(i), t.charAt(i));
            seen.add(t.charAt(i));
        }

        return true;
    }
}