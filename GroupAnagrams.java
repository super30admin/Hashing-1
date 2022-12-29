import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Time Complexity : O(nklogk)
// Space Complexity : O(nk) - for the hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Approach 1: In this approach we use a hashmap to store the sorted strings as keys. We store a list of strings as values.
//For each string we check if the sorted key is there, it is not then we add it and make a new list for the values.
//If it is already present we just add the original string to the list of values. Finally we return all the values of the map.

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<String,List<String>> map = new HashMap<>();

        for (String s : strs) { //n

            //sort
            char [] tempArray = s.toCharArray(); //k
            Arrays.sort(tempArray);  //klogk
            String sorted =  String.valueOf(tempArray);

            if(!map.containsKey(sorted)){ //k
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

// Time Complexity : O(nk)
// Space Complexity : O(nk) - for the hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach 1: In this approach instead of sorting the strings in klogk time we use a primeProduct functions that generates a unique 
//prime product for each string and we can use it as keys instead.

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<Double,List<String>> map = new HashMap<>();

        for (String s : strs) { //n

            double primeProduct = primeProduct(s);
            
            if(!map.containsKey(sorted)){ //k
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private double primeProduct(String str){
        double result = 1;
        int [] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            result *= prime[c - 'a'];
        }

        return result;
    }
}