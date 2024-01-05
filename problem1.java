// Time Complexity : O(N * K * log K) - where N is the length of the input array
// and K is the maximum length of a string in the array
// Space Complexity : O(N * K)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//  grouping of anagrams together by sorting each string and using the
//  sorted string as a key in a HashMap to group the original strings that are anagrams of each other

import java.util.*;

public class problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        problem1 anagramGrouping = new problem1();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = anagramGrouping.groupAnagrams(input);

        System.out.println("Output: " + result);
    }
}