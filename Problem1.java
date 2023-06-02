// Time Complexity : O(n)
// Space Complexity : O(n)
    //n is the number of strings present in the array

// Your code here along with comments explaining your approach in three sentences only
    //We count the number of occurrences of each character in the strings.
    //Group the strings based on the similarity of the number of occurrences of the characters present in them.
    //Return the grouped lists of strings.

import java.util.*;

class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for (String s : strs)
        {
            List<Integer> countArr = new ArrayList<>();
            for (int i=0; i<26; i++)
            {
                countArr.add(0);
            }
            for (char c : s.toCharArray())
            {
                int index = (int)(c-'a');
                countArr.set(index, countArr.get(index)+1);
            }
            List<String> list = map.getOrDefault(countArr, new ArrayList<>());
            list.add(s);
            map.put(countArr, list);
        }
        return new ArrayList<>(map.values());
    }
}