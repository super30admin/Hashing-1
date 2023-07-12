// Time Complexity: O(NK), where N is the length of strs, and K is the maximum length of a string in strs.
//Space Complexity: O(NK), the total information content stored in ans.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for(String i: strs){
            char[] arr = i.toCharArray();
            Arrays.sort(arr);

            String sorted = String.valueOf(arr);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
                
            }
            map.get(sorted).add(i);
                
            
        }
        return new ArrayList<>(map.values());
    }
}

            