// WORD PATTERN

// Time Complexity : O(n)
// Space Complexity : O(1), because we have constant number of alphabets(26)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null && s == null) // Return true if both the strings have not been initialized itself
            return true;

        String[] sStr = s.split(" "); //String s contains words that will be treated as single entities, so split s with space as the delimiter

        if(pattern.length() != sStr.length) //If the number of characters in p and the number of words in s are not equal, the 2 strings cannot be isomorphic, so return false
            return false;

        HashMap<Character, String> pMap = new HashMap<>(); //HashMap to store the mapping from pattern to sStr
        HashMap<String, Character> sMap = new HashMap<>(); //HashMap to store the mapping from sStr to pattern

        for(int i = 0; i < pattern.length() ; i++){ //Loop through all the characters or words, pattern or sStr does not matter because length will be the same
            char pChar = pattern.charAt(i); //Get the character at the ith index from pattern
            String word = sStr[i]; //Get the ith word from sStr

            if(pMap.containsKey(pChar)){ //Check if there is a mapping already for pChar
                if(!pMap.get(pChar).equals(word)){ //If there is a mapping, return false if the value (word) mapped to pChar is not the same as the word at ith index in sStr
                    return false;
                }
            } else {
                pMap.put(pChar, word); //Make an entry in the pMap if it does not already exist for pChar
            }

            if(sMap.containsKey(word)){ //Do the same for s, because pattern should be isomorphic to s and s should also be isomorphic to pattern
                if(!sMap.get(word).equals(pChar)){
                    return false;
                }
            } else {
                sMap.put(word, pChar);
            }
        }
        return true; //The two strings are isomorphic if they surpass all the above conditions
    }
}