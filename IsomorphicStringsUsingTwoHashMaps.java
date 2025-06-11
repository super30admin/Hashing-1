// Time Complexity : O(n), where n is the length of the strings
// Space Complexity : O(1), since HashMaps in this problem store 26 characters at most
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// We use two HashMaps to store character mappings from `s → t` and `t → s`.
// For each character, we check if a consistent mapping exists in both directions.
// If any mismatch is found, we return false.
// This ensures one-to-one and onto character mapping.
// If we reach the end without mismatch, we return true.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            //S->t
            //Check is the character is present in the hashmap
            if(sMap.containsKey(schar)){
                //Check if the value is same
                if(sMap.get(schar) != tchar) {
                    //Return false if not same
                    return false;
                }
            }else{
                //If the character is not present in the hashmap add it
                sMap.put(schar,tchar);
            }

            //Check the same from t->s
            if(tMap.containsKey(tchar)){
                if(tMap.get(tchar) != schar) {
                    return false;
                }
            }else {
                tMap.put(tchar, schar);
            }
        }
        //If no breach return true
        return true;
    }
}