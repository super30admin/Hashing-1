// Time Complexity : O(n) -> since we are iterating over each string
// Space Complexity : O(1) -> it may look like O(n) 
    // but in reality since we are only going to store atmost 26 english lower letters in the map, 
    // the space become O(26) -> O(1)
//  Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
    //None

//Your code here along with comments explaining your approach in three sentences only

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //1st approach
        //maintain two different hashmaps with two way mapping of elements from s and t

        //2nd approach
        //one hashmap and a set
        //iterate through both strings with index and add key value pair in hashmap if not already exists
        //also update the set with current element in t.
        //if a key exist in hashmap but the value is not present in set then we return false, it is not isomorphic.

        //3rd approach
        //just one hashmap
        //suffix the character with the string it is coming from. Such as s_e, s_g


        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }
            else{
                sMap.put(sChar, tChar);
            }

            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }
            else{
                sMap.put(tChar, sChar);
            }
        }

        return true;
    }
}