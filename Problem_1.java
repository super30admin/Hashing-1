/*
 
Problem 2 : Given an array of strings, group anagrams together.

Time Complexity : O(nk)
Space Complexity : O(n)
Did it run on LeetCode : Yes
Any issues encountered : No

Approach : By using the principle of multiplication of prime numbers being unique we can traverse each word and check for the product.
The product acts as the key in a hashmap, and all anagrams can be grouped together.

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> sMap = new HashMap<>();
        for(int i=0; i< strs.length; i++){
            double key = GetTotalOfList(strs[i]);
            if(!sMap.containsKey(key)){
                sMap.put(key, new ArrayList<String>());
            }
            sMap.get(key).add(strs[i]);
        }

        return new ArrayList<>(sMap.values());
    }
    
    private double GetTotalOfList(String strs){
        double product = 1;
        int[] prime_array = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};
        for(int i=0; i<strs.length(); i++)
        {
            char cc = strs.charAt(i);
            int num = cc - 'a';
            product = product * prime_array[num];
        }
        return product;
    }

}
