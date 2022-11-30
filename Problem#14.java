// ISOMORPHIC STRINGS

// Time Complexity : O(n)
// Space Complexity : O(1), because we have constant number of alphabets(26)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) // Return true if both the strings have not been initialized itself
            return true;
        if(s.length() != t.length()) //If length of the 2 strings is different, they cannot be isomorphic
            return false;
        HashMap<Character, Character> sMap = new HashMap<>(); //HashMap to store the mapping from s to t
        HashMap<Character, Character> tMap = new HashMap<>(); //HashMap store the mapping from t to s

        for(int i = 0; i < s.length(); i++){ //Loop through all the characters, s or t does not matter because length will be the same
            char sChar = s.charAt(i); //Get the character at the ith index from s
            char tChar = t.charAt(i); //Get the character at the ith index from t

            if(sMap.containsKey(sChar)){ //Check if there is a mapping already for sChar
                if(sMap.get(sChar) != tChar) //If there is a mapping, return false if the value mapped to sChar is not the same as tChar
                    return false;
            } else {
                sMap.put(sChar, tChar); //Make an entry in the sMap if it does not already exist for sChar
            }

            if(tMap.containsKey(tChar)){ //Do the same for t, because s should be isomorphic to t and t should also be isomorphic to s
                if(tMap.get(tChar) != sChar)
                    return false;
            } else {
                tMap.put(tChar, sChar);
            }
        }
        return true; //The two strings are isomorphic if they surpass all the above conditions
    }
}