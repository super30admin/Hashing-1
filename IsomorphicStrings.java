// Time Complexity : O(k) where k is the length of the strings
// Space Complexity : O (k+k) for storing all k chars from string 1 and string 2 in the HashMap 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Initially thought of generating like a number pattern for the string and compare it to the other string


// Your code here along with comments explaining your approach
// This idea is to create a hashmap with mappings from key as chars from first string mapped to the chars in the second string
// Have a reverse mapping in a 2nd hashmap, in order to quickly check if the same value is not mapped to multiple keys 
// if we encounter inconsistencies, return false, not isomorphic

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        //To ensure bijection condition is checked in O(1)
        HashMap<Character, Character> revMap = new HashMap<Character, Character>();
        
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if(!map.containsKey(a)){
                map.put(a, b);
            }
            else{
                if(!map.get(a).equals(b)){
                    return false;
                }
            }
            if(!revMap.containsKey(b)){
                revMap.put(b,a);
            }
            else{
                if(!revMap.get(b).equals(a)){
                    return false;
                }
            }
        }
        return true;
        
    }
}