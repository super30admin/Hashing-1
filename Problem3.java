// https://leetcode.com/problems/word-pattern/description/

// ## Problem 3:
// Given a pattern and a string str, find if str follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

// Example 1:
// Input: pattern = "abba", str = "dog cat cat dog"
// Output: true

// Example 2:
// Input:pattern = "abba", str = "dog cat cat fish"
// Output: false

// Example 3:
// Input: pattern = "aaaa", str = "dog cat cat dog"
// Output: false

// Example 4:
// Input: pattern = "abba", str = "dog dog dog dog"
// Output: false
// Notes:
// You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

// Approach --
// This is similar to isomorphic strings, but we are mapping chars to strings
// We will maintain two maps for mappings: pattern to s, and s to pattern
// If same string doesn't map to same char and vice-versa, that's a breach and we will return false
// If no breach, we can say that the mapping can be done and return true

import java.util.HashMap;
import java.util.Map;

class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String>  pattMap=new HashMap<>();
        Map<String, Character>  sMap=new HashMap<>();

        // Get all the words in s
        String[] words=s.split(" ");

        // each character should have one mapping, and vice-versa
        if(pattern.length()!=words.length)  return false;

        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=words[i];

            // Check mapping from char to word
            if(pattMap.containsKey(c)){
                if(!word.equals(pattMap.get(c)))    return false;
            }else{
                pattMap.put(c, word);
            }

            // Check mapping from word to char
            if(sMap.containsKey(word)){
                if(c!=sMap.get(word))    return false;
            }else{
                sMap.put(word, c);
            }
        }

        // No breach found
        return true;
    }
}