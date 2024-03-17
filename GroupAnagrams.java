//Time Complexity: O(n * klogk), where n is the number of strings in the input array strs, and k is the maximum length of a string in strs.
//Space Complexity: O(n * k), where n is the number of strings in the input array strs, and k is the maximum length of a string in strs. 
//Code solved in leetcode: Yes
//Approach in 3 lines:
// This code groups anagrams from the input array `strs`.
// It sorts each string's characters to form a unique key, then stores strings with the same key in a HashMap.
// Finally, it returns a list containing all the grouped anagrams found in the HashMap.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) return result;
        HashMap<Double, List<String>> map = new HashMap<>();

        for(int i=0; i< strs.length; i++)
        {
            String s = strs[i];
            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct))
            {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
            // char[] charArr = s.toCharArray();
            // Arrays.sort(charArr); //klogk

            // String sorted = String.valueOf(charArr);

            // if(!map.containsKey(sorted)) // O(k)
            // {
            //     map.put(sorted, new ArrayList<>());
            // }

            // map.get(sorted).add(s); // data structure inside another data strcuture is a reference
            
            // List<string> li = map.get(sorted); // instead of these 3lines above one line is enough
            // li.add(s);
            // map.put(sorted, li);


        }
        return new ArrayList<>(map.values()); // O(n)
        
    }

    private Double primeProduct(String s)
    {
        int[] primes ={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double result =1;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }
}