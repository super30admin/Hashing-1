// Time Complexity : O(n) because we traverse both strings once
// Space Complexity : O(1) since the character set is bounded
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// We maintain mappings in both directions to ensure a one-to-one correspondence between characters.
// While traversing the strings, we verify that every existing mapping remains consistent.
// If any character maps to multiple characters or vice versa, the strings are not isomorphic.

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // validate s -> t mapping
            if(sMap.containsKey(sChar)) {
                if(sMap.get(sChar) != tChar) return false;
            } else {
                sMap.put(sChar, tChar);
            }

            // validate t -> s mapping
            if(tMap.containsKey(tChar)) {
                if(tMap.get(tChar) != sChar) return false;
            } else {
                tMap.put(tChar, sChar);
            }
        }

        return true;
    }
}