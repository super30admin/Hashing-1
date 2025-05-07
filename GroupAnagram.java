// Time Complexity : Using internally differnt string functions such as 1.) toCharArr T.C O(string length) 2.) sorting TC O(n Log(n)) 3. Iterating back all values to list - O(keys length)
// Summing up : twice O(n) if all keys are unique + sorting O(n Log(n)) ~~ O(n Log(n)) 
// Space Complexity : Here using Hashmap to store the keys extra only; the values are already exising string. Keys if all are unique then the worst case is O(n)
// Did this code successfully run on Leetcode : Yes; (https://leetcode.com/submissions/detail/637119219/)
// Any problem you faced while coding this : No
// My Notes : Sort the characters present in the string; then compare if equal. Map the equal ones with the same key; if different then add new pair.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            char[] charArr = str.toCharArray();
            // Sorting the char arrays to get the same key
            Arrays.sort(charArr);
            // Inserting to map if the key doesnt exist
            String key = String.valueOf(charArr);
            System.out.println("Key : "+key);
            // Check in map if key doesnt exist then insert new value else append to existing list
            List<String> list = new ArrayList<>();
            if(map.get(key)==null){
                list.add(str);
                map.put(key, list);
            }else{
                 map.get(key).add(str);
            }
        }
        List<List<String>> values = new ArrayList<>();
        // Iterate map and store list in list of strings and return values.
        for (List<String> list : map.values()) {
            values.add(list);
            System.out.println(list);
        }
        return values;
    }

    public static void main(String[] args) {
        System.out.println("Hey there");
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagram obj = new GroupAnagram();
        obj.groupAnagrams(strs);
    }
}
