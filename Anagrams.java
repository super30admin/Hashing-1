/*
* Approach:
*  1. Use hashmap, because sorted version of anagrams are same.
        use sorted version as key, values as list of strings.

        Complexity: O(n * k logk)
            k - length of the word
* 
*  2. Use bucket/count sort(because range is less), sorting can be linear.
        Store hashmap as key, values as list of strings.
        Complexity : O(n*k)
        
        Alternatively, we can use frequencies vector and 
                convert that into string for unique hash.
* 
*  3. Why to store hashmap or string as key, lets calculate unique hash value using 
        PRIME PRODUCTS.

* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n*k)
* 
* Space Complexity: O(n)
* 
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
                37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };

        HashMap<Double, List<String>> hmap = new HashMap<>();

        for (int index = 0; index < strs.length; index++) {
            String str = strs[index];

            double hashValue = 1;

            for (int sIndex = 0; sIndex < str.length(); sIndex++) {
                char charValue = str.charAt(sIndex);
                hashValue *= (primes[charValue - 'a']);
            }

            System.out.println(hashValue);

            if (!hmap.containsKey(hashValue))
                hmap.put(hashValue, new ArrayList<>());

            hmap.get(hashValue).add(str);
        }

        return new ArrayList<>(hmap.values());
    }
}
