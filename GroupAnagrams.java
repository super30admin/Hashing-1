import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Time Complexity - O(n klogk) n=Size of array k=Avg size of string
// Space complexity - O(n) 

// Constraints:
// 1 <= strs.length <= 10^4
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.

public class GroupAnagrams {

    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                System.out.println(str);
                char[] strArray = str.toCharArray();
                Arrays.sort(strArray);
                String sortedStr = String.valueOf(strArray);
                if (!map.containsKey(sortedStr)) {
                    map.put(sortedStr, new ArrayList<String>());
                }
                map.get(sortedStr).add(str);
            }
            return new ArrayList<>(map.values());
        }
    }
}
