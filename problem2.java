// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class problem2 {
    static int[] primeNumber;

    public static List<List<String>> groupAnagrams(String[] strs) {
        primeNumber = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        List<List<String>> list;
        Map<Double, List<String>> map = new HashMap<>();

        for (String str : strs) {
            double hash = hashValue(str);
            if (!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str);
        }

        list = new ArrayList<>(map.values());
        return list;
    }

    private static double hashValue(String str) {
        double hash = 1;
        for (char c : str.toCharArray()) {
            hash *= primeNumber[c - 'a'];
        }
        return hash;
    }

    public static void main(String[] arg) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
