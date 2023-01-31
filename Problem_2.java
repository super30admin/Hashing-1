// Time Complexity : O(n) where n is number of strings, k is length of each string
// Space Complexity : O(256) = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use two hashmaps here. We map character from s -> t. If on getting the key of sMap we see corresponding character in t 
   is not same as value, we know there are multiple mappings of same character from s to t and we return false. Similarly we use
   tMap to map from t to s and check the same. If mapping is one-to-one in both maps, we return true.
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false;

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if(!sMap.containsKey(c))
                sMap.put(c, t.charAt(i));
            else if(sMap.get(c) != t.charAt(i))
                return false;

            c = t.charAt(i);
            if(!tMap.containsKey(c))
                tMap.put(c, s.charAt(i));
            else if(tMap.get(c) != s.charAt(i))
                return false;
        }
        return true;
    }
}