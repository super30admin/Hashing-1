/*
Time Complexity: O(n)
Space Complexity: O(1) (Since length wont exceed 26)
Approach:
1) Traverse through the strings and get corresponding characters at an index and map those in HashMap
    with key as first string character and value as second string character
2) To validate if there is only one to one character mapping is done we are storing the mapped character in
    second sting in a HashSet
 */

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicChecker {
    public boolean isIsomorphic(String s, String t) {
        //if(s.length() != t.length()) return false;

        // To store character mapping of two strings
        HashMap<Character, Character> hashMap = new HashMap<>();
        // To store mapped characters from second string to ensure one to one mapping
        HashSet<Character> hashSet = new HashSet<>();
        // Traverse through the indexes
        for(int i=0; i<s.length();i++){
            char atS = s.charAt(i);
            char atT = t.charAt(i);
            // If the key is already there in map
            if(hashMap.containsKey(atS)){
                // And mapped to different character, return false
                if(hashMap.get(atS) != atT) return false;
            }
            // If the key is not there in the map yet
            else{
                // But the character from second string is already mapped to some other character from
                //  1st string, return false
                if(hashSet.contains(atT)) return false;
                // Else do the mapping and store the value in set
                else{
                    hashMap.put(atS,atT);
                    hashSet.add(atT);
                }
            }

        }

        return true;
    }
}

