/* Isomorphic Strings */

// Time Complexity : O(N) (where N is the length of any string)
// Space Complexity : O(1) because we are maintaining ASCII characters(lowercase or uppercase-it can be maximum 52 which is constant)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. earlier it was difficult with understanding space complexity to why it was constant time. Now it makes sense

// Your code here along with comments explaining your approach
//We will maintain two hashmaps for s and t
//Case 1) We will iterate over 1st string and map its characters to 2nd string
//and check if a particular char is mapping to 2 char in 2nd string, return false(not isomorphic)
//Case 2) We will check other way mapping from t to s and look for correct mapping

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge case
        if(s.length() != t.length()) return false;
        //initialise two hashmaps for storing mapping from s to t(s-->t) and t to s(t-->s)
        HashMap<Character, Character> sHash = new HashMap<>();
        HashMap<Character, Character> tHash = new HashMap<>();
        //iterate over first string
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            //check if hashmap for s contains key a 
            //if key a doesn't exist, put inside the hashmap
            if(!sHash.containsKey(a)){
                sHash.put(a, b);
            }
            //else, if its exist, check the mapping from s to to 
            else {
                //equals function will consider both lowercases and uppercases, if the case is different, it will still return false
                if(!sHash.get(a).equals(b)) return false;
            }
            //now check if hashmap for t contains key b
            if(!tHash.containsKey(b)){
                tHash.put(b,a);
            }
            else {
                if(!tHash.get(b).equals(a)) return false;
            }
        }
        return true;
    }
}
