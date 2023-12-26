import java.util.*;
// TC: O(NK) where N is number of strings and K is the max length of string
// SC: O(N) where N is the unique number of strings
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String key = getHashKey(s);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private String getHashKey(String s) {
        int[] counts = new int[26];
        for(char ch : s.toCharArray()) {
            counts[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : counts) {
            sb.append(i);
            sb.append("#");
        }
        return sb.toString();
    }
}
