// Time Complexity : O(n) - where n is length of the pattern
// Space Complexity : O(n) - In worst case scenario when given pattern is not anagram, 
//                           the map size can be the length of the words in the string 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * 1. In this approach we will be using a single hashmap to keep track of the mapping.
 * 2. Rather than storing the corresponding mapped value of patter -> string and vice versa, 
 *    we will be storing the index of the pattern and the string.
 * 3. For each and every iteration we store the index of the char, and the index of the string.
 * 4. Once indexes with the corresponding keys are updated, we compare the index of the char and the string.
 * 5. At any point of time if they don't match we return false.
 * 
 * Eg: "abba", "dog cat dog cat" {a - 0, dog - 0, b - 1, cat - 1} -> true
 * Eg: "abba", "dog cat dog fish" {a - 0, dog - 0, b - 1, fish - 3} -> false
 *     When the pointer is at the last position, we compare the index of fish and a.
 *     since they are not equal we return false 
*/

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap map = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (Integer i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (!map.containsKey(c))
                map.put(c, i);

            if (!map.containsKey(w))
                map.put(w, i);

            if (map.get(c) != map.get(w))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
}
