import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// # Hashing-1

// ## Problem 1:
// Given an array of strings, group anagrams together.

// Example:
// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]

// Note:
// All inputs will be in lowercase.
// The order of your output does not matter.

// Time Complexity: O(nklogn) n = number of elements, k = average length of the elements
// Space COmplexity: O(nk)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //claculate prime products of each element
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    } 
}