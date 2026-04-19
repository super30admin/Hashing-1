// Time Complexity : 0(N,K) where N is the size of the Strings, K is the size of the Char Array
// Space Complexity : 0(N,K)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// This code groups anagrams by assigning each character a unique prime number and calculating their product to create a unique value for each group. 
// Since the product of primes is independent of character order, it uses these products as HashMap keys to efficiently collect words with identical character count

import java.util.*;
import java.math.BigInteger;

class GroupAnagrams {
    private int[] primeValues = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<BigInteger, List<String>> hashMap = new HashMap<>();
            for (String str: strs) {
                BigInteger primeFactor = getPrimeFactor(str);
                if(!hashMap.containsKey(primeFactor)) {
                    hashMap.put(primeFactor, new ArrayList<String>());
                }
                hashMap.get(primeFactor).add(str);
        }
        return new ArrayList<>(hashMap.values());
    }

    private BigInteger getPrimeFactor(String value) {
        BigInteger result = BigInteger.ONE;
        for (char ch: value.toCharArray()) {
            result = result.multiply(BigInteger.valueOf(primeValues[ch-'a']));
        }
        return result;
    }
}