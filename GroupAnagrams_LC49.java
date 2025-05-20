//Did this code successfully run on Leetcode :  Yes
//Any problem you faced while coding this :  No
//Time complexity - O(NlogK) + K(hash function check)
//Space complexity - O(N log K) - sorting will internally take space
import java.util.*;

public class GroupAnagrams_LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> anagrams = new ArrayList<>();
        Map<String, List> output = new HashMap<String, List>();
        for(String str : strs){
            char [] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if(output.containsKey(key)){
                output.get(key).add(str);
            } else{
                output.put(key, new ArrayList<>());
                output.get(key).add(str);
            }
        }
        return new ArrayList(output.values());
    }
}