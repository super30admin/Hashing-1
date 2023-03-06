import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

// Time Complexity: O(n * m); where n is the no. of strings and m is the length of the maximum string in list of strings.
// Space Complexity: O(1); we only need a int[] of length max 26
// Did this code run on leetcode? : Yes
class Solution {
    private String hash(String s) {
        int[] arr = new int[26];
        
        for(char c : s.toCharArray()) {
            arr[c - 'a'] += 1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            sb.append(arr[i]);
            sb.append('#');
        }

        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String key = hash(str);
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(str);
        }

        return new ArrayList(map.values());
    }
}