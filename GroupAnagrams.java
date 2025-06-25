// Time Complexity :O(n * k log k)
// Space Complexity :O(n * k)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
// Approach:We are taking a hashmap to store the sorted string and output of a list. 
//for loop will goes in to every string to convert chars in to char array and then sorted them and again will convert in to string by storing as key
// now check map contains key if not add the key and check in to that key if it matches add original string as value matching the key and finally return only values of arraylist
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>>map= new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s =strs[i];

            char [] chars = s.toCharArray();
            Arrays.sort(chars);
            String key= new String(chars);

            if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(s);
    }

    return new ArrayList<>(map.values());

     }
    
}