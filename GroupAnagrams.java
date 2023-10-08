import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
// T.C -> O(n(klogk))
// S.C -> O(n)

// Does it pass LC: Yes
// grouping anagrams based on the sorted keys -> as for every word sorted key would be same
public class GroupAnagrams {

    public static List<List<String>> groupAnagramsfn(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);

            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] stri = { "eat", "ate", "bat" };
        System.out.println(groupAnagramsfn(stri));
    }
}
