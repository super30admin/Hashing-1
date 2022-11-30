// Time Complexity : O(n), n -> length of the string
// Space Complexity : O(n) , 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach in three sentences only
/*
 * split the string having space and stroe it in an array
 * create a map to store the one-one mapping of the string to character.
 * Create a set to store the visited string list.
 * the approach we follow is -> we store the character to string one-to-one mapping and when we iterate through string pattern and store it in the map.
 * we check if the map containes the char from pattern, if so then check the corresponding string array. if they don't match we return false;
 * else
 * we add the new string from string s to set and add the mapping to map. 
 *  
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length)
            return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(strs[i]))
                    return false;
            } else {
                if (set.contains(strs[i]))
                    return false;
                map.put(pattern.charAt(i), strs[i]);
                set.add(strs[i]);
            }

        }

        return true;
    }
}