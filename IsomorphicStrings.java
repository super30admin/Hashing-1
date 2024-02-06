// Time Complexity : O(n) - where n is the length of string S
// Space Complexity : O(1) - hashmap and hashset both uses constant space to store the characters.

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach -:

We need to maintain the unique mapping from s to t and t to s.

Stored the mapping from s to t in hashmap; I have used hashmap because of its optimized search
while iterating over every character in the s.

To check t to s mapping, I have used hashset. While storing s to t mapping, I have stored the
value (from t) in the hashset. This ensures t to S mapping is unique.

Hashmap is not needed in the case of t to s mapping. Because we are checking the existence
of key in s to t hashmap.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;

        int sLen = s.length(), tLen = t.length();

        if(sLen != tLen) return false;

        Map<Character,  Character> charMap = new HashMap<>();
        Set<Character> charSet = new HashSet<>();

        for(int i = 0; i < sLen; i++) {

            if(charMap.get(s.charAt(i)) != null) {
                if(charMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if(charSet.contains(t.charAt(i))) {
                    return false;
                }

                charMap.put(s.charAt(i), t.charAt(i));
                charSet.add(t.charAt(i));

            }
        }

        return true;
    }
}
