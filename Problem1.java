import java.util.*;

// Time Complexity : O(n * k log k) where n is the number of strings and k is the maximum length of a string
// Space Complexity : O(n * k) for storing the anagrams in a HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (String curr : strs) {
            char[] curr_arr = curr.toCharArray();
            Arrays.sort(curr_arr);
            String sorted = new String(curr_arr);

            if (!anagrams.containsKey(sorted)) {
                anagrams.put(sorted, new ArrayList<>());
            }
            anagrams.get(sorted).add(curr);
        }

        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        Problem1 problem = new Problem1();
        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = problem.groupAnagrams(input);
        System.out.println(result); // [[bat], [nat, tan], [ate, eat, tea]]
    }
}
