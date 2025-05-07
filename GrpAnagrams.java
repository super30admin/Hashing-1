// Time Complexity : n*m(log n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Iterating over every string and then every character of the 
 * string was really confusing, tried to get something common 
 * for strings to group them
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GrpAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        Map<String, List<String> > map = new HashMap<> ();
        
        for(int i=0; i<strs.length; i++){
            char[] charArry = strs[i].toCharArray();
            Arrays.sort(charArry);
            String sortedStr = new String(charArry);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(strs[i]);
        }
        return new ArrayList<> (map.values());
    }
}