/*
 * Time complexity: O(N*K) N- length of the strings array k-- length of characters in string
 * Space Complexity: O(N) 
 * Successfully ran this code on leetcode
 */

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,73,79,83,89,97,101,103};
        HashMap<Double, List<String>> store  = new HashMap<>();

        for(String str: strs){
            double key = hashing(str, primes);
            store.computeIfAbsent(key, k-> new ArrayList<>());
            store.get(key).add(str);
        }
        
        return new ArrayList<>(store.values());
        
    }

    private double hashing(String input, int[] primes){
        double product = 1;
        for(char c: input.toCharArray()){
            product *= primes[c - 'a'];
        }

        return product;
    }
}