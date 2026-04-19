// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/*
Created two maps
Added characters as keys, strings as values in map1 and vice versa.
In the process if character/String exists as key, returned false

*/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        char[] t1 = pattern.toCharArray();
        boolean result = true;
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        if (s1.length != t1.length) {
            result = false;
            return result;
        }
        for (int i = 0; i < t1.length; i++) {
            if (!(map1.containsKey(t1[i]))) {
                map1.put(t1[i], s1[i]);
            } else {
                if (!(map1.get(t1[i]).equals(s1[i]))) {
                    result = false;
                    return result;
                }
            }

            if (!(map2.containsKey(s1[i]))) {
                map2.put(s1[i], t1[i]);
            } else {
                if (!(map2.get(s1[i]).equals(t1[i]))) {
                    result = false;
                    return result;
                }
            }
        }

        return result;

    }
}