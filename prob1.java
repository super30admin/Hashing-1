// Time Complexity : O(N * K * log K)
// Space Complexity : O(NK)
// DIterate through each string in the array.
// Convert each string into a char array, sort it, and convert back to a string to create a unique representation for anagrams.
// Use a hash map to group strings with the same sorted representation, and return the grouped anagrams.

import java.util.*;

public class AnagramGrouping {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        AnagramGrouping anagramGrouping = new AnagramGrouping();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = anagramGrouping.groupAnagrams(input);
        System.out.println(result);
    }
}
