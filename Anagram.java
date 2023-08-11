//time Complexity = o(nklogk)
//Space Complexity = o(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {
        String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };

        Anagram obj1 = new Anagram();
        List obj2 = obj1.groupAnagrams(s);

        System.out.println("output" + obj2);

    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> arr = new HashMap<>();
        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            if (!arr.containsKey(sorted)) {
                arr.put(sorted, new ArrayList<>());
            }
            arr.get(sorted).add(s);

        }
        return new ArrayList<>(arr.values());
    }
}
