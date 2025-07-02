// Time Complexity : O(n)
//  Space Complexity : O(1) : no extra space used
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
// Three line explanation of solution in plain english:
//1. We create a map to track the mapping of characters from s to t and t to s.
//2. We iterate through the characters of both strings simultaneously, checking the mappings.
//3. If we find any inconsistencies in the mappings, we return false; otherwise, we return true.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If the lengths of the strings are not equal, they cannot be isomorphic
        int slen=s.length(); int tlen=s.length();
        HashMap<Character, Character> sMap=new HashMap<>();
        HashMap<Character, Character> tMap=new HashMap<>();
        // Create mappings for both strings
        for(int i=0;i<slen;i++){
            // Get the characters at the current index for both strings
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            // Check if the character from s is already mapped to a character in t
            if(sMap.containsKey(sChar)){
                // If it is mapped, check if it matches the current character in t
                // If it does not match, return false
                if(sMap.get(sChar)!=tChar){
                    return false;
                    }
                }
            // If it is not mapped, add the mapping from s to t
                else{
                    sMap.put(sChar,tChar);
                }
            // Check if the character from t is already mapped to a character in s
            if(tMap.containsKey(tChar)){
                // If it is mapped, check if it matches the current character in s
                // If it does not match, return false
                // If it is not mapped, add the mapping from t to s
                if(tMap.get(tChar)!=sChar){
                    return false;
                    }
                }
            // If it is not mapped, add the mapping from t to s
                else{
                    tMap.put(tChar,sChar);
                    }
        }
        // If all mappings are consistent, return true
        return true;
    }
}