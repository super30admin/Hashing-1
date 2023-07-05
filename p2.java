// Time Complexity : Time complexity would be O(n)
// Space Complexity : Space complexity would be constant O(1)
// Did this code successfully run on Leetcode :Yes

// Any problem you faced while coding this : Nno

// Your code here along with comments explaining your approach
//Using two hashmap approach. One hashmap is used to store key as String s and value as String t while other hashmap is viceversa. If the key is present then check if the value matches. if the value does not match return false

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (!smap.containsKey(schar)) {
                smap.put(schar, tchar);
            } else if (smap.get(schar) != tchar)
                return false;

            if (!tmap.containsKey(tchar)) {
                tmap.put(tchar, schar);
            } else if (tmap.get(tchar) != schar)
                return false;

        }

        return true;

    }
}