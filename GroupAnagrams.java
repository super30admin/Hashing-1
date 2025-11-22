// Time Complexity: O(nk) -> where k is the average length of a string and n is the number of strings
// Space Complexity: O(nk) -> to store n strings of k length

// 1: We store the first 26 prime numbers in an array to calculate the prime product of each string in the input
// 2: For each string, the prime product will be a unique value through which we can insert into the HashMap
// 3: To pass test cases, we use BigInteger datatype
import java.math.BigInteger;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<BigInteger, List<String>> map = new HashMap<>();
        for (String str : strs) {
            BigInteger primeProduct = primeProduct(str);
            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private BigInteger primeProduct(String s) {
        int[] primeNums = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
                79, 83, 89, 97, 101 };
        BigInteger primeProd = BigInteger.ONE;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            primeProd = primeProd.multiply(BigInteger.valueOf(primeNums[ch - 'a']));
        }
        return primeProd;
    }

}