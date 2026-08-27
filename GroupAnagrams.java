//Time Complexity : O(n*k)
//Space Complexity : O(n*k)

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    Map<BigInteger, List> map;

    public List<List<String>> groupAnagrams(String[] strs) {
        map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int n = strs.length;
        for (String s : strs) {
            //Find the prime product.
            BigInteger product = getProduct(s);
            if (map.containsKey(product)) {
                map.get(product).add(s);
            } else {
                List<String> li = new ArrayList<>();
                map.put(product, li);
                li.add(s);
            }
        }
        return new ArrayList(map.values());
    }

    private BigInteger getProduct(String s) {
        int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        BigInteger result = BigInteger.ONE;
        for (char a : s.toCharArray()) {

            BigInteger count = BigInteger.valueOf(prime[a - 'a']);
            result = result.multiply(count);
        }
        return result;
    }

}
