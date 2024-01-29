// Time complexity: O(n * mlogm); n = total number of strings; m = average length of string; mlogm is the time complexity to sort the string
// Space complexity: O(n): Hashmap size
/* Approach: We put the sorted strings as keys in hashmap and store the original keys in an array as a value of that key.
 * Finally, iterate the hashmap and append the values to the result list.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // hashmap key = string; value = arraylist of strings
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            // sorting the key
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            // checking if the sorted key exists in the hashmap
            // creating an array at the key if key does not exist
            if (!map.containsKey(sorted)) {
                ArrayList<String> newArr = new ArrayList<String>();
                map.put(sorted, newArr);
            }
            map.get(sorted).add(strs[i]);
        }

        // iterating the hashmap
        for (String key : map.keySet()) {
            res.add(map.get(key));
        }

        return res;
    }
}