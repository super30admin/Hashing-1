// Time Complexity : O(n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach : Create a hashmap to hold mappings for each character in s to corresponding character in t, and a set to hold all the
//            values entered so far. If for a character in s, the corresponding character in t is different from the existing value
//            in the hashmap or is already a value for a different key, the strings are not isomorphic.

// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else {
                if (set.add(t.charAt(i)) == false)
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
