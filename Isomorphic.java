// Time Complexity : O(n) where n is the size of strings
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character > map = new HashMap<>();
        for(int i =0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){   
                if(map.get(s.charAt(i)) == t.charAt(i)){                
                    continue;
                }else {
                    return false;
                }
            }else if(map.containsValue(t.charAt(i))){
                return false;
            }else {
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}