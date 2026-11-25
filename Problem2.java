// Time Complexity : O(N)
// Space Complexity: O(1) atmost 256 ascii characters so O(256)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) {
                    return false;
                }
            }
            else {
                if(tSet.contains(tChar)){
                    return false;
                }
                sMap.put(sChar, tChar);
                tSet.add(tChar);
            }
        }
        return true;
    }
}