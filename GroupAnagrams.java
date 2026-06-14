import java.math.BigInteger;
import java.util.*;

class Solution {
    /*  time complexity - O(n*k)
        SC - O(n)
    */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<BigInteger, List<String>> map = new HashMap<>();

        for (String str :  strs) {
            // calculate prime product of the string
            BigInteger primeProduct = primeProduct(str);
            //add to map
            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }

        // return the grouped anagrams by fetching the vaues from map 
        return new ArrayList<>(map.values());
    }

    private BigInteger primeProduct (String s) {
        // assign prime num to each character
        int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // for each char in string calculate fetch its corresponding prime number and calculate the product
            // in this way each character returns unique value and we can identify which words are anagrams
            res = res.multiply(BigInteger.valueOf(prime[ch - 'a']));
        }
        return res;
    }
}
