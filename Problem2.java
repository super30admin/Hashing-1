// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Hash map is created with matching each letter in the first string with the respective letter
//in the second string. Returns false if the letters are not matching in the iteration, returns true in case of sucess


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<Character, Character>();
        for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == t.charAt(i)){
                    continue;
            }else if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
            else{
                return false;
            }
        }
        return true;
    }
}