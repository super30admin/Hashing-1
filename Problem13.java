// Time Complexity : O(log(N))
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this: easy problem to understand from lecture, not sure about space complexity here

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap <Character, Character> sMap = new HashMap<>();//first hashmap for string s
        HashMap <Character, Character> tMap = new HashMap<>();//second hashmap for string t
        
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //insert each string one by one in each of the maps as key value pairs
            //if the character is already in the hashmap then check to see if it's existing value
            //corresponds to the same character that is being added
            //both hashmaps should have opposite key value pairings
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, tChar);
            }else{
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar, sChar);
            }else{
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }                       
        }
        
        return true;
    }
}
