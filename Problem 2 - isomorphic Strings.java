// Time Complexity : O(s)
// Space Complexity : O(s+t)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/*
We can take one char from s and map it to another char at t, 
if we encounter same char in s we check if its mapped to the same char in t If Not, return false
if we trying to map to a value in t, and if that value was already taken (i.e mapped by a char in s), then return false

otherwise return true

*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
    
    HashMap<Character,Character> map = new HashMap<Character,Character>();
    Set<Character> values = new HashSet<Character>();
    
    for(int i=0;i<s.length();i++){
        Character charS = s.charAt(i);
        Character charT= t.charAt(i);
        // check if the mapping is already there
        if(map.containsKey(charS)){
            // if key is there , then it should be mapped to the same value
            if(map.get(charS) != charT){
                return false;
            }
        }
        else{ // the key is not mapped

        // check if the value it is going to be mapped to has aleady been taken
        if(values.contains(charT)){
            // this value is already been mapped to some key,  so not isomorphic
            return false;
        }

        map.put(charS,charT); // creating mapping in the hashmap
        values.add(charT); // adding value as taken

        }

    }
     return true;
        
    }
}