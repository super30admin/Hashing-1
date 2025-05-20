import java.util.*;

// Time Complexity : O(n) where n is the length of the string
// Space Complexity : O(n) for storing the mappings in two HashMaps
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm1 = new HashMap();
        HashMap<String, Character> hm2 = new HashMap();
        List<String> list = Arrays.asList(s.split(" "));

        if (pattern.length() != list.size())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String word = list.get(i);

            if (hm1.containsKey(pChar)) {
                if (!hm1.get(pChar).equals(word))
                    return false;
            } else {
                hm1.put(pChar, word);
            }

            if (hm2.containsKey(word)) {
                if (!hm2.get(word).equals(pChar))
                    return false;
            } else {
                hm2.put(word, pChar);
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Problem3 problem = new Problem3();
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = problem.wordPattern(pattern, s);
        System.out.println(result); // true
    }
}
