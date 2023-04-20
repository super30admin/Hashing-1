// Time Complexity : O(nklogk) where n are total number of string and k is largest length of 1 string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * We sort each string and store as key in map, values are list of string for anagram
 * We iterate over the list and check if the sorted string is in map and if yes we group them and retunr the grouped list
 * else we add it in the map.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length < 1) {
            return new ArrayList<>();
        } 
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

// Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * As we saw above, sorting takes nklogk, to eliminate log we can utilize mathematic fact that product of prime numbers are unique
 * For each character in given string we assing a prime number and calculate the product which acts as a key in map
 * We iterate over the list and check if the product is in map and if yes we group the anagrams and retunr the grouped list
 * else we add it in the map.
 * 
*/
class GroupAnagramsPrime {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length < 1) {
            return new ArrayList<>();
        }
        HashMap<Double, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            double product = primeProduct(s);
            if(!map.containsKey(product)) {
                map.put(product, new ArrayList<>());
            }
            map.get(product).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private double primeProduct(String s) {
        double result = 1;
        int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * prime[c - 'a'];
        }
        return result;
    }
}
