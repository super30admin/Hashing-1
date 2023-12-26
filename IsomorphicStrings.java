/*
* Approach:
*  1. As we are checking s to t strings mapping and t to s mapping 
        and this should be happening in O(1). 
        
    Therefore, we can use hashmap(keys: characters of S, values: characters of T).
* 
*  2. For every character of S, map it with t character at same sIndex.
        But, we have to check whether tchar is mapped to other character in S.

        Therefore, we have to check values of hashmap.
* 
*  3. Checking hashmap values costs O(n). 
        To keep track of hashmap values in O(1), we can use hashset.
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(N) -> N - length of the strings
* 
* Space Complexity: O(1) -> max ascii characters will be 256 which is constant.
* 
*/

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> hmap = new HashMap<>();

        HashSet<Character> hset = new HashSet<>();

        for (int index = 0; index < s.length(); index++) {
            if (hmap.containsKey(s.charAt(index))) {
                if (hmap.get(s.charAt(index)) != t.charAt(index))
                    return false;
            } else {
                if (!hset.contains(t.charAt(index))) {
                    hset.add(t.charAt(index));
                    hmap.put(s.charAt(index), t.charAt(index));
                } else
                    return false;
            }
        }

        return true;
    }
}
