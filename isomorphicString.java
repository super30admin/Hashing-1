// Time Complexity : O(n), n -> length of the string
// Space Complexity : O(1) , atmost 26 characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach in three sentences only
/*
 * create a map to store the one-one mapping of the strings.
 * Create a set to store the visited character list.
 * the approach we follow is -> we store the character one-to-one mapping and when we iterate through string s and store it in the map.
 * we check if the map containes the char from s, if so then check the corresponding character in string t. if they don't match we return false;
 * else
 * we add the new character from string t to set and add the mapping to map. 
 *  
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (set.contains(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }

        }

        return true;
    }
}