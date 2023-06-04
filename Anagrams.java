// Time Complexity : O(n*m) where n is the length of strs[] array (number of input strings) and m is max length of a string in the sts[] array
// Space Complexity : O(n*m) in the worst case when there are no anagrams, where n is the number of strings in the str[] array and m is the length of each string in the str[] array
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length < 1){
            return new ArrayList<List<String>>();
        }
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s:strs){
            if(s == null) continue;
            char[] frequencyArr = new char[26]; //only lowercase chars in input
            for(char c: s.toCharArray()){
                frequencyArr[c-'a']++;
            }
            if(!map.containsKey(String.valueOf(frequencyArr))){
                map.put(String.valueOf(frequencyArr), new ArrayList<String>());
            }
            map.get(String.valueOf(frequencyArr)).add(s);
        }
        return new ArrayList<>(map.values());
    }
}