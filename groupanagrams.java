// Time Complexity : O(nklogk) where n is the number of words and k is the length of each word
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Calculating time complexity

// Approach : we are sorting the each word in the array and checking if that sorted string is present in the hashmap as all the anagrams 
// have the same sorted order. if the hash map contains the sorted string we add the original word to the hashmap with the sorted order as the key.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs==null || strs.length==0) return new ArrayList<>();
       HashMap<String,List<String>> map = new HashMap<>();
       for(String str : strs){
           char charArray[] = str.toCharArray();
           Arrays.sort(charArray);
           String sorted = String.valueOf(charArray);
            if(!map.containsKey(sorted)) {
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(str);        
       } 
       return new ArrayList<>(map.values());
    }
}