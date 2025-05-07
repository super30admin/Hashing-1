// Time Complexity : Internally using different string functions such as  Iterating through char arr ~ O(length of string) ~ O(n); Other hashmap operations are in constant O(1) TC
// Space Complexity : Storing values in map; twice O(keys) ~ O(n); Here using Hashmap to store the keys extra only; the values are already exising string. Keys if all are unique then the worst case is O(n)
// Did this code successfully run on Leetcode : Yes; (https://leetcode.com/submissions/detail/636904404/)
// Any problem you faced while coding this : No;
// My Notes : Check bidirecitonal normal and reverse; if any chnage then return
import java.util.HashMap;

class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            // Check if the character contains key; if contains key then check if existing map is equal to the current character
            if (map1.containsKey(charS)) {
                if (map1.get(charS) != charT) {
                    return false;
                }
            } else {
                // insert if a new key is found
                map1.put(charS, charT);
            }

            // check reverse mapping; if contains key then check if existing map is equal to the current character
            if (map2.containsKey(charT)) {
                // Check if equal
                if (map2.get(charT) != charS) {
                    return false;
                }
            } else {
                // insert if a new key is found
                map2.put(charT, charS);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(" Hey there!!!");
    }
}
