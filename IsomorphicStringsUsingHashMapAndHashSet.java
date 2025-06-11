// Time Complexity : O(n), where n is the length of the strings
// Space Complexity : O(1), since HashMaps in this problem store 26 characters at most
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// We use a HashMap to maintain a mapping from characters of string s to string t.
// We also use a HashSet to ensure no two characters from s map to the same character in t.
// While iterating, we check if the mapping is consistent and if the value is already used.
// If all checks pass, we return true; otherwise, false when inconsistency is found.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> hset = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            //Check is the character is present in the hashmap
            if(sMap.containsKey(schar)){
                //Check if the value is same
                if(sMap.get(schar) != tchar) {
                    //Return false if not same
                    return false;
                }
                //If the character is not present in the hashmap, check if its in hashset
            }else{
                if(hset.contains(tchar)){
                    return false;
                }
                //else put it in the map and its value in hset
                sMap.put(schar,tchar);
                hset.add(tchar);
            }
        }
        //If no breach return true
        return true;
    }
}