package sree;
import java.util.*;
public class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] sortedArr = str.toCharArray();
            Arrays.sort(sortedArr);
            String sortedStr = String.valueOf(sortedArr);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            List<String> li= map.get(sortedStr);
            li.add(str);
            map.put(sortedStr,li);
        }

        return new ArrayList<>(map.values());
    }
}
