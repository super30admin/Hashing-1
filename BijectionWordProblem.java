/*
Time Complexity : O(n)
Space Complexity : O(1) 2 hashmap of size 26 * max word size

Did this code successfully run on Leetcode :
Finished in 1 ms // faster than 91.85% of Java online submissions for Word Pattern.
true

Any problem you faced while coding this :
None

Your code here along with comments explaining your approach :
BiMap approach
*/
import java.util.HashMap;
import java.util.Map;

public class BijectionWordProblem {

    public static boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null) return false;
        Map<Character, String> patternToWord = new HashMap<>();
        Map<String, Character> wordToPattern = new HashMap<>();
        String[] wordArray = s.split(" ");
        if(wordArray.length != pattern.length()) return false;
        for (int i = 0; i < wordArray.length;i++){
            if(!(patternToWord.containsKey(pattern.charAt(i)) || wordToPattern.containsKey(wordArray[i]))){
                patternToWord.put(pattern.charAt(i), wordArray[i]);
                wordToPattern.put(wordArray[i], pattern.charAt(i));
            } else if (patternToWord.containsKey(pattern.charAt(i)) && wordToPattern.containsKey(wordArray[i])){
                if(!patternToWord.get(pattern.charAt(i)).equals(wordArray[i]))
                    return false;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abcd";
        String wordList = "dog cat cats dogs";

        System.out.println(wordPattern(pattern, wordList));
    }
}
