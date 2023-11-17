//T.C O(n)
//S.C O(n)
// Did this code successfully run on Leetcode : yes (https://leetcode.com/problems/word-pattern/)
// Any problem you faced while coding this : -

import java.util.HashMap;
import java.util.HashSet;

/*
Using hashmap to map pattern char to its first string. Using HashSet to track words already mapped to pattern
For each word in i/p string, check if the word is associated with pattern and matches existing pattern.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] p = pattern.toCharArray();
        HashSet<String> set = new HashSet();
        String[] ip = s.split(" ");
        if(p.length != ip.length)
            return false;

        HashMap<Character, String> map = new HashMap<>();
        for(int i=0; i< ip.length; i++) {
            if(map.containsKey(p[i])) {
                //check if the word matches the value from the map
                if(!ip[i].equals(map.get(p[i]))){
                    return false;
                }
            } else { //There is no entry of pattern earlier
                //Need to check if the value is not associated with another char in pattern, check in set
                if(!set.add(ip[i]))
                    return false;
                map.put(p[i],ip[i]);
            }
        }
        return true;
    }

    public static void main(String ar[]) {
        WordPattern wp = new WordPattern();
        System.out.println("Test 1:::" + wp.wordPattern("abc", "b c a"));

        System.out.println("Test 1:::" + wp.wordPattern("abba", "dog dog dog dog"));
        System.out.println("Test 1:::" + wp.wordPattern("abba", "dog cat cat dog"));
        System.out.println("Test 2:::" + wp.wordPattern("aaaa", "dog dog cat dog"));
    }
}
