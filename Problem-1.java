
// Time Complexity : O(n*k)
// Space Complexity :O(nk)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :None

// Your code here along with comments explaining your approach in three sentences only
//there are 3 approaches for this, one is through greedy iterating through each
//2nd is through cal frequency, 3rd is prime product
//i calculated the prime array of length 26 and then cal product. created dictionary product as key and list of list as values.

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<BigInteger, List<String>> output = new HashMap<>();

        if (strs.length == 0) {
            return new ArrayList<>();
        }

        for (int i = 0; i < strs.length; i++) {
            BigInteger calProd = prod(strs[i]);

            output.computeIfAbsent(calProd, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(output.values());
    }


    private BigInteger prod(String str) {

        int[] prime_array = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
            73, 79, 83, 89, 97, 101
        };

        BigInteger product = BigInteger.ONE;

        for (char c : str.toCharArray()) {
            int idx = c - 'a';

            // multiply using BigInteger
            product = product.multiply(BigInteger.valueOf(prime_array[idx]));
        }

        return product;
    }
}
