// Time Complexity : O(n)
// Space Complexity : O(s) - unique words in s
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/*
We verify if a given string s adheres to a specified pattern pattern. It compares each character in the pattern with its corresponding substring in s, ensuring consistency and uniqueness in the mappings.
 If all characters in the pattern are appropriately mapped to substrings in s, it returns true; otherwise, it returns false.
 */

import java.util.HashMap;
import java.util.HashSet;

public class wordPattern {
    public static boolean isWordPattern(String pattern, String s) {
        String[] s_subStrings = s.split(" ");
        if (pattern.length() != s_subStrings.length) return false;
        HashMap<Character, String> pMap = new HashMap<>();
        HashSet<String> sHashSet = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            if (pMap.containsKey(pChar)) {
                if (!s_subStrings[i].equals(pMap.get(pChar))) return false;
            } else {
                if (sHashSet.contains(s_subStrings[i])) {
                    return false;
                } else {
                    pMap.put(pChar, s_subStrings[i]);
                    sHashSet.add(s_subStrings[i]);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isWordPattern("abba", "dog cat cat dog"));
        System.out.println(isWordPattern("abba", "dog dog dog dog"));
    }
}
