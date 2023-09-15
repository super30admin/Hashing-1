// Time Complexity : Added below for both solutions
// Space Complexity : Added below for both solutions
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    //Time Complexity - O(n*klogk)
    //Space complexity - O(n) or O(nk)


    // public List<List<String>> groupAnagrams(String[] strs) {
    // if(strs == null || strs.length == 0) {
    //     return new ArrayList<>();
    // }
    //     Map<String, List<String>> map = new HashMap<>();
    //     for(int i = 0; i < strs.length ; i++){
    //         String str = strs[i];
    //         char[] charArray = str.toCharArray();
    //         Arrays.sort(charArray);
    //         String sorted = String.valueOf(charArray);
    //         if(!map.containsKey(sorted)){
    //             map.put(sorted, new ArrayList<>());
    //         }
    //         map.get(sorted).add(str);
    //     }
    //     return new ArrayList<>(map.values());
    // }

    //Time Complexity - O(n*k)
    //Space complexity - O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<Double, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            double primeProduct = getPrimeProduct(str);
            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private double getPrimeProduct(String str) {
        int prime[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double result = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result = result * prime[c - 'a'];
        }
        return result;
    }

}