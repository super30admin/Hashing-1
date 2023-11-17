//T.C O(1)
//S.C O(1)
// Did this code successfully run on Leetcode : yes (https://leetcode.com/problems/group-anagrams/)
// Any problem you faced while coding this : -

import java.util.*;

//Given an array of strings, group anagrams together.
//Sol: For each of strings in array, sort the characters and add to hashmap as key
//if the key already exists, append the new string to existing list
//Return map values
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> hm = new HashMap<>();
        for(String s : strs){

            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(s);

        }
        return new ArrayList<>(hm.values());
    }
}
