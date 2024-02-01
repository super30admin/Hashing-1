import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Time Complexity : O(n*k), where n=len(strs) and k=len(strs[i])
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No

// Your code here along with comments explaining your approach in three sentences only

/**
 * Approach 1: Sort each string and store it as a key and map values to it. This way,
 * we will get all anagrams. TC: O(n*klogk)

 * Approach 2: Represent each character by a prime number to avoid collision and
 * for each string, get a product for each character in that string. Anagrams will
 * have same product. TC: O(n*k)
 */

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> map = new HashMap<>();

        for (String s : strs) {
            double product = findProduct(s);
            if (!map.containsKey(product)) {
                map.put(product, new ArrayList<>());
            }
            map.get(product).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private static double findProduct(String s) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double result = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }
}
