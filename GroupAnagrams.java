// Time Complexity :  n log(k)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> strList = new ArrayList<>();
        if(strs.length == 0) {
            return strList;
        }

        Map<String, List<String>> strMap = new HashMap<>();

        for(int i=0; i <= strs.length - 1; i++) {
            char[] eachChar = strs[i].toCharArray();
            Arrays.sort(eachChar);
            String currentStr = new String(eachChar);

            if(!strMap.containsKey(currentStr)) {
                List<String> currentList = new ArrayList<>();
                currentList.add(strs[i]);
                strMap.put(currentStr, currentList);
            } else {
                List<String> currentList = strMap.get(currentStr);
                currentList.add(strs[i]);
                strMap.put(currentStr, currentList);
            }
        }

        for(Map.Entry<String, List<String>> entry: strMap.entrySet() ) {
            strList.add(entry.getValue());
        }

        return strList;
    }
}
