// Time Complexity : O(n * k) where n is the number of strings and k is the average string length
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// We assign a unique prime number to each character and compute the product of primes for every string.
// Anagrams produce the same prime product because they contain the same characters with the same frequencies.
// We use the prime product as the HashMap key to group all anagrams together.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<BigInteger, List<String>> map = new HashMap<>();

        for(String str : strs) {

            // compute unique key for anagram group
            BigInteger primeProduct = primeProduct(str);

            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }

            map.get(primeProduct).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private BigInteger primeProduct(String str) {

        int[] prime = new int[]{
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53, 59, 61, 67,
            71, 73, 79, 83, 89, 97, 101, 103
        };

        BigInteger result = BigInteger.ONE;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result = result.multiply(BigInteger.valueOf(prime[ch - 'a']));
        }

        return result;
    }
}