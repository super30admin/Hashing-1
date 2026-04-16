import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


// Time Complexity :O (N*KlogK) where N is the number of strings and K is the length of the longest string in the array
// Space Complexity :o(N*K) where N is the number of strings and K is the length of the longest string in the array
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No , Still confused with the other prime product approach, need to check.
// Your code here along with comments explaining your approach in three sentences only
// We will go through each string in the array, and sort it
// Maintain a hashmap of the sorted string as key and the related strings as a list.
// If the key matches add the corresponding string to the list.
//Else add the key and new list to map
// return arraylist of the values of the map.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

             HashMap<String , List<String>> map = new HashMap<>();

             for(String str : strs){
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String keystr = new String(chars);
                if(!map.containsKey(keystr)){
                map.put(keystr, new ArrayList<>());
            }
            map.get(keystr).add(str);
             }
        return new ArrayList<>(map.values());
    }
}