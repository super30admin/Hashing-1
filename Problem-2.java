// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :None

// Your code here along with comments explaining your approach in three sentences only
//maintain 2 hashmaps one for s to t mapping and other for t to s mapping

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) return false;
            } else {
                sMap.put(sChar, tChar);
            }

            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) return false;
            } else {
                tMap.put(tChar, sChar);
            }
        }

        return true;
    }
}
