// Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/**
 * 1. Create a hashmap with key as string with character count and value as list of strings.
 * 2. Add all the strings with same key to the list.
 * 3. Return the list of values.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];

        for(String str : strs){
            Arrays.fill(count, 0);
            for(char ch : str.toCharArray()){
                count[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder(" ");
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}