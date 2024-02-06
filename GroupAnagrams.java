// Time Complexity : O(n) - where n is the length of string pattern
// Space Complexity : O(w) - w is words in the string s
// *. hashmap and hashset both uses constant space to store the characters.

// Did this code successfully run on Leetcode : Yes, faced use with ==.  I have used .equals()
// Any problem you faced while coding this : No

/*
Approach -:

We need to maintain the unique mapping from s to pattern and pattern to s.

To maintain the mapping from pattern to s, I have used hashmap because of its optimized search
while iterating over every character in the pattern

To check s to pattern mapping, I have used hashset. While storing pattern to s mapping, I have stored the
word (from s) in the hashset. This ensures s to pattern mapping is unique.

Hashmap is not needed in the case of s to pattern mapping. Because we are checking the existence
of key in pattern to s hashmap.
 */

import java.util.*;

public class GroupAnagrams {
    int[] primeNumbers = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

    private double getPrimeProduct(char[] charArr) {
        double hash = 1;

        for(char ch : charArr) {
            hash *= primeNumbers[ch - 'a'];
        }

        return hash;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();

        Map<Double, List<String>> anagramMap = new HashMap<>();

        for(String str : strs) {
            double hash = getPrimeProduct(str.toCharArray());

            if(!anagramMap.containsKey(hash)) {
                anagramMap.put(hash, new ArrayList<>());
            }

            anagramMap.get(hash).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
