/*
Time Complexity : O(n klogk) where n is the number of elements in the array and k is max number of characters in string.
Space Complexity : O(nk) 
Ran on Leetcode : Yes
Approach : Sort the strings and maintain an Hashmap. return the values.
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hashmap = new HashMap<>();
        
        for(String s: strs){
            
           char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String t = String.valueOf(sArray);
            
            if(!hashmap.containsKey(t)){
                hashmap.put(t, new ArrayList<String>());
            }
            
            hashmap.get(t).add(s);
               
        }
        
        return new ArrayList<List<String>>(hashmap.values());
        
    }
}