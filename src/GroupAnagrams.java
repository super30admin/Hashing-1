// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/**
 * https://leetcode.com/problems/group-anagrams/submissions/
 * Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 *
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> data = new HashMap<>();
        
        for(String str: strs) {
            String code = getHashCode(str);
            
            if(!data.containsKey(code)) {
                data.put(code, new ArrayList<>());
            }
            data.get(code).add(str);
        }
        
        return new ArrayList<>(data.values());
    }
    
    /**
     * create a hashcode using count of each char in the string
       since we have only lower case alphabets in the input,
        we can use constant space of 27 char
     */
    private String getHashCode(String str){
        int arr[] = new int[27];
        
        for(char c: str.toCharArray())
            arr[c - 'a']++;
        
        StringBuilder sb= new StringBuilder();
        
        for(int j=0; j<arr.length; j++) 
            sb.append(arr[j]);
        
        return sb.toString();
    }
}