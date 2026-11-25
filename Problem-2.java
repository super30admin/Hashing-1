// Time Complexity: O(n), where n is the length of the string.
// Space Complexity: O(1), since both strings contain only ASCII characters,
// each HashMap can contain at most 256 entries.

// Approach: Use two HashMaps to maintain a one-to-one mapping between the characters of s and t in both directions.
// For each pair of characters, check if an existing mapping conflicts with the current pair and return false if it does.
// Otherwise, add the mappings to both HashMaps and continue until all characters have been checked.

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> sTot = new HashMap<>();
        HashMap<Character,Character> tTos = new HashMap<>();
        for(int i=0;i<s.length(); i++){
            if(sTot.containsKey(s.charAt(i)) && !sTot.get(s.charAt(i)).equals(t.charAt(i))){
                return false;
            }
            if(tTos.containsKey(t.charAt(i)) && !tTos.get(t.charAt(i)).equals(s.charAt(i))){
                return false;
            }
            sTot.put(s.charAt(i),t.charAt(i));
            tTos.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}
