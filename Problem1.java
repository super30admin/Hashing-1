//The basic idea of this solution is to have an array of size 26 that contains
// the first 26 prime numbers. Then, we can go through the array of strings
// and calculate a value by multiplying its character's associated prime number.
// An example would be abc = 2 * 3 * 5. Then, update a hashmap based on 
// repeating values. 
//Space: O(1)
//Time: O(m*n) where m is average size of each string and n is size of strs

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
    int[] primeArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    HashMap<Double,List<String>> hm = new HashMap<>();
    for(String s: strs){
        double sum = 1;
        int ascii = 0;
        for(int i = 0;i<s.length();i++){
            ascii = primeArray[s.charAt(i)- 97];
            sum = sum * ascii;
        }
        if(!hm.containsKey(sum)){
            hm.put(sum,new ArrayList<String>());
        }
        hm.get(sum).add(s);
    }
    return new ArrayList<>(hm.values());

    }
}