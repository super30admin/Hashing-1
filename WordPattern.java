import java.util.HashMap;
import java.util.Locale;

/*
Time Complexity : O(n)
Space Complexity: O(n)
Run on Leetcode: yes
Any difficulties: No

Approach:
1. In this question, I would be doing one character to String mapping
2. When such mapping comes then the choosing HashMap as the data structure is the best idea,
3. The algorithm will remain same as it was for isomorphic strings

 */
public class WordPattern {
    public static boolean isPatternMatched(String pattern, String word){
        // Split the given string at space
        String[] words = word.split(" ");

        if(pattern.length()!=words.length){
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        char[] pArr = pattern.toCharArray();

        for(int i = 0; i<pattern.length(); i++){
            if(map.containsKey(pArr[i])){
                if(map.get(pArr[i]).equals(words[i])){
                    continue;
                }else{
                    return false;
                }
            }else if(map.containsValue(words[i])){
                return false;
            }else{
                map.put(pArr[i], words[i]);
            }
        }

        return true;
    }

    public static void main(String[] args){
        String word = "dog cat cat dog";
        String pattern  = "abba";

        System.out.println("Pattern matches? " + isPatternMatched(pattern, word));
    }
}
