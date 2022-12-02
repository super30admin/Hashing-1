// Isomorphic Strings
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.


// Approach
// will consider 2 hashmap. Then will compare 1st hashmap's' index is mapped to 2nd hashmap's' index.
// so that we can keep track of both side mapping.
// if it's the 1st time, we have to make an entry for that element and if already present then compare.


class Solution {
    public boolean isIsomorphic(String s, String t) {
        //base case
        if(s == null || t == null) return true;
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //for smap
            //check if key is already present(will check for every index)
            if(sMap.containsKey(sChar)) {
                //if different mapping, mapped with a different char
                if(sMap.get(sChar) != tChar) return false;
            }
            //if a new key
            else {
                sMap.put(sChar, tChar);
            }


            //for tmap, same operations have to do as smap
            if(tMap.containsKey(tChar)) {
                if(tMap.get(tChar) != sChar) return false;
            }
            else {
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}