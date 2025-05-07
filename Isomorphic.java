// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Isomorphic{
    public boolean isIsomorphic(String s, String t){
        // return false if lengths of string are not equal
        if(s.length() != t.length()) return false;

        // Create hashmaps to store relations
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            // Get characters at each index of both the strings
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                // if the charcter at index i of string s is already mapped to an element at index i of string t
                // return false if element at index i of string t does not match the key value of string s stored in hashmap
                if(sMap.get(sChar) != tChar) return false;
            } else {
                // if the character does not exist in hashmap, then store the key value pair
                sMap.put(sChar, tChar);
            }

            if(tMap.containsKey(tChar)){
                // if character at index i of string t is already mapped to an element at index i of string s
                // return false if element at index i of string s does not match the key value of string t stored in hashmap
                if(tMap.get(tChar) != sChar) return false;
            } else {
                // if the character does not exist in hashmap, then store the key value pair
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}