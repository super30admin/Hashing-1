// Time complexity : O(nklog k) - klogk to sort every string of length k , n is the total size of string array 
// Space Complexity : O(k) k is length of string 
// sucessfully submitted on leetcode
// sorting the strings , and then adding to map, sorted string as key and the actual string as its value 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hMap= new HashMap<>();
        for(String s:strs){
           char[] chars= s.toCharArray(); // returns seq of chars 
           Arrays.sort(chars);
           String sortedString = String.valueOf(chars);
            if(!hMap.containsKey(sortedString)){
                hMap.put(sortedString,new ArrayList<>());
            }
                 hMap.get(sortedString).add(s);

        }
        return new ArrayList<>(hMap.values());
    }
}