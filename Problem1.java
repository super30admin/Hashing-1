import java.util.*;

// Time Complexity : O(n * klog(k))
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// the sorted string for all the anagrams would be the same. Created a map
//with the key as the sorted string and value as collection of original string. Collect all the
//values into an arrayList
class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> revList = new ArrayList<String>();
        Map<String,List<String>> mapList = new HashMap<>();
        for(String s : strs){
            String revS = returnSortedStringArray(s);
            if(!mapList.containsKey(revS)){
                mapList.put(revS, new ArrayList<>());
            }
            mapList.get(revS).add(s);
        }
        return new ArrayList<>(mapList.values());
    }

    public String returnSortedStringArray(String inputString){
        char[] charArr = inputString.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}