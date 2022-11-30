// Time Complexity : For Iterating over the arra, O(strs) , for Hashing the strings O(str) so total time complexity is O(strs * str)
// Space Complexity : Using a hashMap and a Hash Set , HashMap would contains the grouped elements , so the Space would be O(strs)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

/*
We will have an underlying hashmap . for each string, we would be creating a hash as a key and store its value in Linked List , that way string with same key
will be grouped together
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0){
            return null;
        }

        List<List<String>> result = new ArrayList<List<String>>();

        // underlying HashMap
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        // iterating over each string in the array
        for(int i=0;i<strs.length;i++){ // O (strs)
            String currentHash = hash(strs[i]); // O(str) ==> constant if the length of the string is constant across all the strings
            if(!map.containsKey(currentHash)){
                map.put(currentHash, new ArrayList<String>());
            }
            map.get(currentHash).add(strs[i]);

        }
        // At this point the map should have all the keys and values, now its time to combine them

        groupStrings(result,map);

        return result;
         
    }

    private void groupStrings(List<List<String>> result , HashMap<String, List<String>> map){
        for(String key : map.keySet() ){

            result.add(map.get(key));
        }
    }

    //O(str)
    private String hash(String input){

        // array of int , index as char and its value as count

        int[] chars = new int[26];

        // iterate over the string , get each char and increase the counter in the array
        for(int i=0;i<input.length();i++){  // O(str)
            int charIndex = input.charAt(i) - ' ' - 65;
            chars[charIndex]++;
        }

        // at this point the array should be filled up already
         StringBuilder hashString = new StringBuilder();

         for(int i=0;i<26;i++){// O (26)
             hashString.append(chars[i]).append('#');
         }
         // it would now generate a unique string, 
         // each position in the array was a char, and each value is the count
         // converting it back to the key

         return hashString.toString();
    }
}