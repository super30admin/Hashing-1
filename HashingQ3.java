//## Problem 3:
//        Given a pattern and a string str, find if str follows the same pattern.
//        Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
//
//        Example 1:
//        Input: pattern = "abba", str = "dog cat cat dog"
//        Output: true
//
//        Example 2:
//        Input:pattern = "abba", str = "dog cat cat fish"
//        Output: false
//
//        Example 3:
//        Input: pattern = "aaaa", str = "dog cat cat dog"
//        Output: false
//
//        Example 4:
//        Input: pattern = "abba", str = "dog dog dog dog"
//        Output: false
//        Notes:
//        You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
//TC:O(n)
//SC:O(n)
//Solved on leetcode: No 40/42 testcases passed
import java.util.HashMap;
import java.util.Map;

public class HashingQ3 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Character, Integer> charToWord = new HashMap<>();
        Map<String, Integer> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if(charToWord.put(pattern.charAt(i),i) == wordToChar.put(words[i],i))
                continue;
            else{
                // System.out.println("i="+i+charToWord.put(pattern.charAt(i),i)+" "+wordToChar.put(words[i],i));
                return false;
            }
        }
        return true;
    }
}
