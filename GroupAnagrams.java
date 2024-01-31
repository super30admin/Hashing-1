// Time Complexity : O(nk) - Iterate Array of n and each has k elements in each string (average)
// Space Complexity : O(nk) 
// Challenges : This is tough program to code it out!
// Does it run on Leet Code? : Yes

// This is hashset, hashmap solution. Both are hashing functions based.
// If character is already being mapped to something else before and available in Set and not there in Map then it is wrong.


import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class GroupAnagrams {

    int[] primProdArr = {2,3,7,11,13,17,19,23,29,31,37,39,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
    public List<List<String>> groupAnagrams(String[] strs) {
     
        if(strs == null) return new ArrayList<>();
        if(strs.length == 0) return new ArrayList<>();

        Map<Long,List<String>> map = new HashMap<>();//nk - space
        
        for(String str : strs){ // n
            long prim = primeProduct(str);

            if(!map.containsKey(prim)){
                map.put(prim, new ArrayList<String>());                
            }
                
            map.get(prim).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public long primeProduct(String str){//k
        long primeprod = 1;
        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            primeprod = primeprod * primProdArr[c-'a'];
        }

        return primeprod;
    }
    
}
