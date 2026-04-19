// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/*
Created two maps
Added s1 as keys, t1 as values in map1 and vice versa.
In the process if character exists as key, returned false

*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean result = true;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        if (s1.length != t1.length) {
            result = false;
            return result;
        }
        for (int i = 0; i < s1.length; i++) {
            if (!(map.containsKey(s1[i]))) {
                map.put(s1[i], t1[i]);
            } else {
                if (map.get(s1[i]) != t1[i]) {
                    result = false;
                    return result;
                }
            }

            if (!(map2.containsKey(t1[i]))) {
                map2.put(t1[i], s1[i]);
            } else {
                if (map2.get(t1[i]) != s1[i]) {
                    result = false;
                    return result;
                }
            }
        }

        return result;

    }
}