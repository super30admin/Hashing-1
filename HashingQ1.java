//## Problem 1:
//        Given an array of strings, group anagrams together.
//
//        Example:
//        Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//        Output:
//        [
//        ["ate","eat","tea"],
//        ["nat","tan"],
//        ["bat"]
//        ]
//
//        Note:
//        All inputs will be in lowercase.
//        The order of your output does not matter.

import java.util.*;
//TC: O(n*k);
//SC: O(n);
public class HashingQ1 {
    int[] primeArr;
    public List<List<String>> groupAnagrams(String[] strs) {
        primeArr = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};

        HashMap<Double, List<String>> map = new HashMap<>();
        for(String str:strs){ //n
            double hash = getHashValue(str);
            if(!map.containsKey(hash))
                map.put(hash, new ArrayList<>());
            map.get(hash).add(str);

        }
        return new ArrayList<>(map.values());
    }


    private double getHashValue(String str){ // k

        double hash = 1d;
        for(char c: str.toCharArray()){//abc
            hash*=primeArr[c-'a']; // for a it will get prime value representing 0 i.e 2;
        }
        return hash;
    }
//    TC: O(n*k*log(k))
//    SC: O(n);
//    public List<List<String>> groupAnagrams(String[] strs) {
//      if( strs == null || strs.length == 0) return new ArrayList<>();
//
//        HashMap<String,List<String>> map = new HashMap<>();
//        for(String str : strs){
//            char[] charArr = str.toCharArray();
//            Arrays.sort(charArr);
//            String sorted = String.valueOf(charArr);
//            if(!map.containsKey(sorted)){
//                map.put(sorted, new ArrayList<>());
//            }
//            map.get(sorted).add(str);
//        }
//        return new ArrayList<>(map.values());
//    }

}
