import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// To have a unique key and still identify the anagrams, associate each char with a prime number
// The product of prime numbers based on the chars of a string will match even if the order of chars are different
// Maintain the prime product keys in map and add all the strings which are matching the prime product to the values list

class Problem1_GroupAnagrams {
    private int[] prime;
    public List<List<String>> groupAnagrams(String[] strs) {
        this.prime = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,103};
        if(strs==null || strs.length==0) return new ArrayList<>();
        HashMap<Double, List<String>> res = new HashMap<>();
        for(String str: strs){
            double prod = primeProduct(str.toCharArray());
            if(!res.containsKey(prod)){
                res.put(prod, new ArrayList<>());
            }
            res.get(prod).add(str);
        }
        return new ArrayList<>(res.values());
    }

    private double primeProduct(char[] arr) {
        double prod=1;
        for(char c:arr){
            prod*=prime[c-'a'];
        }
        return prod;
    }
}