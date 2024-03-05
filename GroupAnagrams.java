//primes array should be in calculateProduct method. Double should be type of hashmap
// tc = o(nk) where n is array length and k is length of string
// sc = o(nk)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String str:strs){
            double primeProd = calculateProduct(str);
            if(!map.containsKey(primeProd)){
                map.put(primeProd,new ArrayList<>());
            }
            map.get(primeProd).add(str);
        }
        return new ArrayList<>(map.values());

    }

    private double calculateProduct(String str){
         int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double prod = 1;
        for(char ch:str.toCharArray()){
            prod = prod * primes[ch-'a'];
        }
        return prod;
    }
}