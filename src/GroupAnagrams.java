// Time Complexity : O(NK) where is N is the number of strings in array and k is the max length of a string in the array
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Take a map of string to list of strings. Iterate over the array
 * and make a hash string using the count of each char in each string.
 * Make this hash string as the key and put the strings which have same
 * hash string. Finally return the map values as a list.
 *
 */
class Solution {
    HashMap<String, List<String>> ans = new HashMap<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        for(String str : strs) {
            int[] count = new int[26];
            for(char c : str.toCharArray()) count[c - 'a']++;
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString(); 
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(str);
        }
        return new ArrayList<>(ans.values());
    }
}