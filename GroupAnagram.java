//Time Complexity: O(nk) n is the number of elements and k is the average length.
//Space Complexity: O(nk) 

/*
 * the idea is to implement double hashing 
 * and multiply the character with the prime number and if the number exist we add it to the list
 * else we create a new list.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length ==0) return new ArrayList<>();
        HashMap <Double, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            String s = strs[i];
            double primeProduct = findPrimeProduct(s);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    public double findPrimeProduct(String s){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        
        double res = 1;
        
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            res = res*primes[sChar- 'a'];
        }
        return res;
    }
}
