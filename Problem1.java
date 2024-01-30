// https://leetcode.com/problems/group-anagrams/description/
// ## Problem 1:
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

//Approach -----
// Fact: Prime product will be same for all anagrams of a string
// We have used the above concept link all the anagrams
// We need to store and retrieve all the anagrams of a string,
// the best way to do this is use a hashing based ds, hashmap in this case

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Problem1 {

    private int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

    // Generate prime product to be used as hash
    private double getPrimeProduct(String s){
        double primeProduct=1.0;
        for(Character c: s.toCharArray()){
            primeProduct*=primes[c-'a'];
        }
        return primeProduct;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> result=new HashMap<>();
        for(String str: strs){
            double hash=this.getPrimeProduct(str);
            // Anagram group not found
            if(!result.containsKey(hash))   result.put(hash, new ArrayList<>());
            result.get(hash).add(str);
        }
        // result.values() resturns a collection of values, which we pass into
        // constructor of List to get an array list
        return new ArrayList<>(result.values());
    }
}