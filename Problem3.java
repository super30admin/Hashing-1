// Time Complexity : O(n)
// Space Complexity : O(n)
    //n is the number of strings present in the array

// Your code here along with comments explaining your approach in three sentences only
    //We first split the string s into substrings separated by a whitespace(" ") and put them in a string array.
    //We then traverse through the characters in the pattern string and the strings in the string array. We Map each character in the source string to the corresponding string in the array.
    //When a character or a string appears again, we verify if they are mapped correctly, if they are not we return false.
    //At every iteration, we check both character and corresponding string if they are mapped correctly to avoid edge case failures like abba->cat cat cat cat.

import java.util.*;

class Problem3 {
    public boolean wordPattern(String pattern, String s) 
    {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> revMap = new HashMap<>();
        String[] words = s.split(" ");
        int n = pattern.length();
        if (n!=words.length)
        {
            return false;
        }
        for (int i=0; i<n; i++)
        {
            if (map.containsKey(pattern.charAt(i)))
            {
                if (map.get(pattern.charAt(i)).equals(words[i])==false)
                {
                    return false;
                }
            }
            if (revMap.containsKey(words[i]))
            {
                if (revMap.get(words[i]).equals(pattern.charAt(i))==false)
                {
                    return false;
                }
            }
            map.put(pattern.charAt(i), words[i]);
            revMap.put(words[i], pattern.charAt(i));
        }
        return true;
    }
}