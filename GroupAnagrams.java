//Time Complexity - O(n * k) n is number of strings and k is length of each string.
//Space Complexity - O(n)

// Implemented using a HashMap to group anagrams with keys stored as primeproduct of the strings.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<Double, List<String>> map = new HashMap<>();
        for(int i =0; i< strs.length; i++) {
            String s = strs[i];
            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());

            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());

    }

    private double primeProduct(String s) {
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        double result = 1.0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * primes[c-'a'];
        }
        return result;
    }
}
