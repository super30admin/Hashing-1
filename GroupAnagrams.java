// Time complexity : O(n*k) where n is number of strings and k is length of each string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// Problem 1:
// Given an array of strings, group anagrams together.

// Example:
// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]

// Note:
// All inputs will be in lowercase.
// The order of your output does not matter.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // BASE CASE
        if (strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<Double, List<String>> map = new HashMap<>();
        for (String s : strs) {
            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)){ // If this product is not yet in map, creating a new list
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s); // Adding the string to the corresponding list
        }
        return new ArrayList<>(map.values());
    }

    // Helper method to generate a unique prime product for a given string
    private double primeProduct(String s){

        // 26 distinct primes for each lowercase English letter
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double result = 1.0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }
}