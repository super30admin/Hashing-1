/*
* Approach:
*  1. Split the words in the second string by space.
* 
*  2. Use the same pattern like Isomorphic Strings i.e.
        Hashmap for storing pattern to S mappings
        Hashset to store values of S.
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(k)
    k - length of the word
* 
* Space Complexity: O(26) for hashmap keys + 
        O(26) at max only 26 words can be mapped --> O(1)
* 
*/

import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");

        HashMap<Character, String> hmap = new HashMap<>();

        HashSet<String> hset = new HashSet<>();

        if (pattern.length() != sArray.length)
            return false;

        for (int index = 0; index < sArray.length; index++) {
            Character key = pattern.charAt(index);

            if (hmap.containsKey(key)) {
                if (!hmap.get(key).equals(sArray[index]))
                    return false;
            } else {
                if (!hset.contains(sArray[index])) {
                    hset.add(sArray[index]);
                    hmap.put(key, sArray[index]);
                } else
                    return false;
            }
        }

        return true;
    }
}
