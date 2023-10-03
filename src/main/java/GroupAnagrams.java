/* Time Complexity :  O(nk) 
 *  n - traverse the string array
 *  k - get the prime product (key) for mapping*/
/* Space Complexity : O(nk) 
 *  n - the number of keys in hashmap and 
 *  k - space taken by the values (here the list)*/
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();

        //traverse string array
        for(int i = 0; i < strs.length; i++){ //O(n)
            String s = strs[i];
            //get the prime product for the string - which will be the key in our hashmap
            Double primeProduct = primeProduct(s); //O(k)

            //If key is not present create new and add values
            if(!map.containsKey(primeProduct)){ //O(k)
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values()); // O(n)
    }

    private double primeProduct(String s){
    	//first 26 prime numbers - as range is lower case english letters
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};

        double result = 1d;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            result = result*prime[c - 'a'];
        }
        return result;
    }
}
