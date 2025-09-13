/*
* We need to keep track of the characters mapped in s with t. For that we can use a hashmap
* We also need to keep track of the characters we have seen in t so we use a set for that.
* If the character is in the map and is not mapped with the current character we are at in t, that means the character in s is mapped to some other character in t, so return false
* If t is already seen, that means it has been mapped with some character in s so there is a breah
*/

// TC: O(n) -> Length of String s which is equal to length of string t 
// SC: O(n) -> Using map for storing mapping and set to store unique mapped characters.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if the length of both the strings are not same then they are not isometric
        if(s.length() != t.length())
            return false;

        // create a hashmap to store s to t mapping and set to track if characters in t has already be seen, if it is seen that mean its already has been mapped with some character in s so they are not isometric  
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // check if the character in s is present, if it is present, check if it is mapped with the same character that t is at, if not return false
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar)
                    return false;
            }

            // check if we have seen t already, if we have that means, it is mapped with some character in s already, return false
            else{
                if(tSet.contains(tChar))
                    return false;
                else{
                    sMap.put(sChar,tChar);
                    tSet.add(tChar);
                }
            }
        }
        return true;
    }
}