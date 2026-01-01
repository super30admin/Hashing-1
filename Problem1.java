//Time complexity O(NKlogK) and space complexity O(N*K)

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map= new HashMap<>();
        for(int i=0; i<strs.length;i++){

            String curr= strs[i];
            //sorting the strs[i] strings
            char [] charArray= curr.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            //checking if hashmap conatins key or not
            //if it is empty then add key with a empty list asvalue
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            //Retrieve the list associated with the sorted key
            List<String> li=map.get(sorted);
            //add the curr string to it and update the map
            li.add(curr); //list li is a refference and in that pointer we are adding curr
            //map.put(sorted,li); //we dont need to put pointer again
        }
        return new ArrayList<>(map.values());
                
    }
}