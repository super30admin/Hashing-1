// Time Complexity : O(nk), n in pattern length and k is largest string in s
// Space Complexity : O(1) + O(n) =~ O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * we use 2 hashmap to store pattern -> s and s -> pattern mapping very similar to isomorphic problem.
 * We iterate over the lenght of string and check in both maps for each iteration and return false,
 * if we find a mismatch.
 */

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> wordMap = new HashMap<>();
        HashMap<String, Character> patternMap = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            String str = words[i];
            char c = pattern.charAt(i);
            if(wordMap.containsKey(c)) {
                if(!wordMap.get(c).equals(str)) {
                    return false;
                }
            } else {
                wordMap.put(c, str);
            }
            if(patternMap.containsKey(str)) {
                if(patternMap.get(str) != c) {
                    return false;
                }
            } else {
                patternMap.put(str, c);
            }
        }
        return true;
    }
}

// Time Complexity : O(nk), n in pattern length and k is largest string in s
// Space Complexity : O(1) + O(n) =~ O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * we use 1 hashmap to store pattern char -> s string and 1 hashset to store string very similar to isomorphic problem.
 * We iterate over the lenght of string and check in maps and set for each iteration and return false,
 * if we find a mismatch.
 */

 class WordPatternSet {
    public boolean wordPattern(String pattern, String s) {
        //This takes time nk
        String[] words = s.split(" ");
        if(pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> wordMap = new HashMap<>();
        HashSet<String> patternMap = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++) {
            String str = words[i];
            char c = pattern.charAt(i);
            if(wordMap.containsKey(c)) {
                if(!wordMap.get(c).equals(str)) {
                    return false;
                }
            } else {
                if(patternMap.contains(str)) {
                    return false;
                }
                patternMap.add(str);
                wordMap.put(c, str);
            }
        }
        return true;
    }
 }
