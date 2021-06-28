//Problem:
205.Isomorphic Strings

        Given two strings s and t,determine if they are isomorphic.

        Two strings s and t are isomorphic if the characters in s can be replaced to get t.

        All occurrences of a character must be replaced with another character while preserving the order of characters.No two characters may map to the same character,but a character may map to itself.


// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Map each character of first string to another string using HashMap.
If same character repeats check if key is present and if the value matches with it
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) return true;

        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i), tchar = t.charAt(i);

            if (map.containsKey(schar)) {
                if (map.get(schar) != tchar)
                    return false;
                else continue;
            } else {
                if (!map.containsValue(tchar)) {
                    map.put(schar, tchar);
                } else return false;
            }
        }
        return true;

    }
}