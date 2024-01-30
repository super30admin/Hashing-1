import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Time Complexity - O(nk) n=Size of array k=Avg size of string
// Space complexity - O(n) Map of size n

// Constraints:
// 1 <= strs.length <= 10^4
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.

public class GroupAnagramsWithPrimeNumbers {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            int[] primesArray = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
                    83, 89, 97, 101 };
            Map<Double, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] strArray = str.toCharArray();
                double product = 1;
                for (char ch : strArray) {
                    product *= primesArray[ch - 97];
                }
                if (!map.containsKey(product)) {
                    map.put(product, new ArrayList<>());
                }
                map.get(product).add(str);
            }
            return new ArrayList<>(map.values());
        }
    }
}
