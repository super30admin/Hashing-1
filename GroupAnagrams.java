//Time Complexity - O(N * M),N - total number of characters in all strings in the input array, and M is the length of the longest string.
//Space Complexity -O(n)

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class GroupAnagrams {

    int[] first26Primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
            97, 101, 103 };

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Double, List<String>> map = new HashMap<>();

        for (String str : strs) {
            double primeProduct = getPrimeProduct(str);
            map.computeIfAbsent(primeProduct, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private double getPrimeProduct(String str) {
        double primeProduct = 1;
        for (int i = 0; i < str.length(); i++) {
            primeProduct = primeProduct * (first26Primes[str.charAt(i) - 'a']);
        }
        return primeProduct;
    }
}
