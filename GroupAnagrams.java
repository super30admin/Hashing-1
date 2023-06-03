import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    // public List<List<String>> groupAnagrams(String[] strs) {
    // if(strs==null || strs.length==0)
    // return new ArrayList<>();

    // Map<String,List<String>> map=new HashMap<>();
    // for(String str:strs){
    // char [] c=str.toCharArray();
    // Arrays.sort(c);
    // String sorted=String.valueOf(c);
    // Arrays.sort(sorted.toCharArray());
    // if(!map.containsKey(sorted)){
    // map.put(sorted,new ArrayList<>());
    // map.get(sorted).add(str);
    // }else{
    // map.get(sorted).add(str);
    // }
    // }
    // return new ArrayList<>(map.values());
    // }

    // Time Complexity : n*klog(k) where k is the average length of the strings
    // Space Complexity: O(nk)

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        int prime[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        Map<Double, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            double key = 1;
            for (char i : c) {
                key = key * (prime[i - 'a']);
            }
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                map.get(key).add(str);
            } else {
                map.get(key).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}

// Time Complexity : n*k where k is the average length of the strings
// Space Complexity: O(nk)
